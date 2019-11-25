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
    public void TestCircleVolum()
    {
        double Circlevol = CircleVolum.getCircleVolum(5);
        double ans  =  (4.0/3.0)*3.1415*(5*5*5);
        assertEquals(Circlevol, ans,0);
    }






}
