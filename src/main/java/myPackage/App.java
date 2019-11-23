package myPackage;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Subject mySubject = new Subject();
        for(ISubscriber sub : subscribers){
            sub.setSubject(mySubject);
            mySubject.addSubscriber(sub);
            sub.Start();
        }
        Scanner scanner = new Scanner(System.in);
        Double Number = scanner.nextDouble();
        mySubject.setValue(Number);
        scanner.close();
    }
    private static ISubscriber subscribers[] = {
        new CircleCircumference(),
    // New functions will be added here
    };
}

