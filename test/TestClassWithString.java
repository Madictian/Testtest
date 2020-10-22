import Zunit.Testsuite;

public class TestClassWithString extends Testsuite {

        @Override
        public void testMethodList() {
            passingTest();
            failingTest();
        }

        public static void main(String[] args) {
            TestClass testClass = new TestClass();
            testClass.runTestSuit();


        }

        private void passingTest(String excepted, String actual){

            assertEquals(new String("yep"), new String("yep"));
        }
        private void failingTest(){
            assertEquals(new String("yep"),new String("nope"));

        }
    }
