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
}
