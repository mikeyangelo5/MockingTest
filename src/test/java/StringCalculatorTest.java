import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void test1(){
        System.out.println("result: " + 0);
        assertEquals(0, stringCalculator.Add(""));
    }

    @Test
    public void test2(){
        System.out.println("result: " + 3);
        assertEquals(3, stringCalculator.Add("1,2"));
    }

    @Test
    public void test3(){
        try {
            stringCalculator.Add("-1,2");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void test4(){
        //mengabaikan bilangan lebih dari 1000
        System.out.println("Result: " + 2);
        assertEquals(2, stringCalculator.Add("1001,2"));
    }
}

