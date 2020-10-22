package Zunit;

public abstract class Testsuite {
    private int passed;
    private int failed;

    public void runTestSuit(){
        passed = 0;
        failed = 0;

        testMethodList();
        System.out.println("tests passed: " + passed);
        System.out.println("tests failed: " + failed);
    }
    public abstract void testMethodList();

    public void assertEquals(int expected, int actual){
        if (expected == actual){
            passed++;
        }
        else {
            failed++;
            System.out.println("test " + (passed + failed) + " has failed\nthe expected was: " + expected + " \nthe actual was: " + actual + "\n\n");
        }

    }


}
