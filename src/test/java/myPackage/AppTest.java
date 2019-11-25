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
    public void TestCircleArea()
    {
        double area = CircleArea.get_CircleArea(4);
        double ans  = 4*4*3.1415;
        assertEquals(area, ans,0);
    }
}
