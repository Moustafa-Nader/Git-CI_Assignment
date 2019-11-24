package myPackage;

public class CircleCircumference extends SubThread {
  
    public static double getCircleCircumference(double num) {
        return (2 * 3.1415 * num);
    }
    
    public void Operate() {
        System.out.println("Circle Circumference = " + getCircleCircumference(subject.getValue()));
    }

}