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
    public void TestCircleArea()
    {
        double area = CircleArea.get_CircleArea(4);
        double ans  = 4*4*3.1415;
        assertEquals(area, ans,0);
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

	
    @Test
    public void TestCircleVolum()
    {
        double Circlevol = CircleVolum.getCircleVolum(5);
        double ans  =  (4.0/3.0)*3.1415*(5*5*5);
        assertEquals(Circlevol, ans,0);
    }





}
