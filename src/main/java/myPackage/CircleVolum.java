package myPackage;

public class CircleVolum extends SubThread {
  
    public static double getCircleVolum(double num) {
        return ((4.0/3.0) * 3.1415 * (num*num*num));
    }
    
    public void Operate() {
        System.out.println("Circle Volume = " + getCircleVolum(subject.getValue()));
    }

}