import Zunit.Testsuite;

public class TestClass extends Testsuite {

    @Override
    public void testMethodList() {
        passingTest();
        failingTest();
    }

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.runTestSuit();


    }

    private void passingTest(){
        assertEquals(5,5);
    }
    private void failingTest(){
        assertEquals(3,7);

    }
}
