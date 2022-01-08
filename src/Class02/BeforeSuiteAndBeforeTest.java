package Class02;

import org.testng.annotations.*;

public class BeforeSuiteAndBeforeTest {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("Iam before suit");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("Iam anafter suit");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Iam before Test");
    }
        @AfterTest
    public void afterTest(){
            System.out.println("Iam an after Test");
        }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Iam before Class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("Iam an after Class");
    }
    @Test(groups="regression")
    public void regressionTest(){
        System.out.println("Iam regression test");
    }
    @Test(groups="smoke")
    public void smokeTest(){
        System.out.println("Iam smoke test");
    }
}
