package myPackage;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Subject mySubject = new Subject();
        for (ISubscriber sub : subscribers) {
            //set the subscriber subject with mysubject
            sub.setSubject(mySubject);
            //add the subscriber to the subject's list of subscribers
            mySubject.addSubscriber(sub);
            //start the subscriber's thread
            sub.Start();
        }
        Scanner scanner = new Scanner(System.in);
        Double Number = scanner.nextDouble();
        //set the subject value with number and notify all the subscribers
        mySubject.setValue(Number);
        scanner.close();
    }

    private static ISubscriber subscribers[] = {
         new CircleCircumference(),
	     new Factorial(),
	     new fibonacci (),
	     new Sum(),
	     new CircleVolum(),
	     new CircleArea(),
             new SphereArea(),
	     new LucasSeries(),


            // New functions will be added here
    };
}
