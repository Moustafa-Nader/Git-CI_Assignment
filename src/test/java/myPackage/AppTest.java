package myPackage;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void TestCircleCircumference()
    {
        double Circlecircum = CircleCircumference.getCircleCircumference(7);
        double ans  = 7*2*3.1415;
        assertEquals(Circlecircum, ans,0);
    }
    @Test
    public void TestFactorial()
    {
        double fact = Factorial.getFactorial(7);
        double ans  = 7*6*5*4*3*2*1;
        assertEquals(fact, ans,0);
    }
    @Test
    public void TestSum()
    {
        double sum = Sum.getSum(7);
        double ans  = 0+1+2+3+4+5+6+7;
        assertEquals(sum, ans,0);
    }
}
