package Class01;

import org.testng.annotations.*;

public class BeforeClassAndAfterClass {
    @BeforeClass
    public void beforeClass() {
        System.out.println("Iam a before Class");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("Iam an after Class");
    }
@BeforeMethod
public void beforeMethod() {
    System.out.println("Iam before method");
}
@AfterMethod
public void afterMethod() {
    System.out.println("Iam after method");
}
    @Test
    public void firstTest() {

        System.out.println("First test");
    }
    @Test
    public void secondTest(){
        System.out.println("Second test");
    }
    @Test
    public  void thirdTest(){

        System.out.println("Third test");
    }
}


