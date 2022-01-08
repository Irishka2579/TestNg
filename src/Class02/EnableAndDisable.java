package Class02;

import org.testng.annotations.Test;

public class EnableAndDisable {

    @Test(enabled = true)//not nessesary to put true, its automatically
    public void firstTest() {

        System.out.println("First test");
    }
    @Test(enabled = false)//will dissapear from testing
    public void secondTest(){
        System.out.println("Second test");

    }
    @Test(enabled = true)
    public  void thirdTest(){
        System.out.println("Third test");

    }
}

