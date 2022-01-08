package Class02;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DependsOn {
    @Test
    public void login(){
        System.out.println("Test");
    }
    @Test(dependsOnMethods="login")
    public void  verificationOfDashboards(){
        System.out.println("Iam depend scenario");
    }

}
