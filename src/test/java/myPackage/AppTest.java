package myPackage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
    public void testfibonacci ()
    {
        double fibb = fibonacci .getfibonacci (7);
        double ans  = 13.0;
        assertEquals(fibb, ans,0);
    }
}
