package Class01;

import org.openqa.selenium.json.JsonOutput;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PreconditionAndPostCondition {
    @BeforeMethod
    public void  beforeMethod(){
        System.out.println("Iam a pre-condition");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("Iam post condition");
    }
    @Test
    public void test(){
        System.out.println("Iam an actual test");
    }

@Test
    public void anotherTest(){
    System.out.println("Iam another test");
}

}
