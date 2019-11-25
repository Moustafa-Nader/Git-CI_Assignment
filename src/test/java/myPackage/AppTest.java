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
    public void TestMain(){
        ISubscriber subscribers[] = {
            new CircleCircumference(),
           // New functions will be added here
         };   
        Subject mySubject = new Subject();
        for (ISubscriber sub : subscribers) {
            //set the subscriber subject with mysubject
            sub.setSubject(mySubject);
            //add the subscriber to the subject's list of subscribers
            mySubject.addSubscriber(sub);
            //start the subscriber's thread
            sub.Start();
        }
        Double Number = 5.0;
        //set the subject value with number and notify all the subscribers
        mySubject.setValue(Number);
        

    }
    @Test
    public void TestFactorial()
    {
        double fact = Factorial.getFactorial(7);
        double ans  = 7*6*5*4*3*2*1;
        assertEquals(fact, ans,0);
    }


    @Test
    public void testfibonacci ()
    {
        double fibb = fibonacci .getfibonacci (7);
        double ans  = 13.0;
        assertEquals(fibb, ans,0);
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
    
    @Test
    public void TestCircleArea()
    {
        double Area = CircleArea.get_CircleArea(4);
        double ans  = 4*4*3.1415;
        assertEquals(Area, ans,0);
    }




}
