package Class02;

import org.testng.annotations.Test;

public class PriorityClass {

    @Test(priority=3)
    public void firstTest() {

        System.out.println("First test");
    }

    @Test(priority=1) //priority kill alphabetic way and become priority
    public void secondTest(){
        System.out.println("Second test");
    }

    @Test(priority=2)
    public  void thirdTest(){
        System.out.println("Third test");

    }
}

