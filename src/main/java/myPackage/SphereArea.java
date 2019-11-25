package myPackage;

public class SphereArea extends SubThread {
  
    public static double getSphereArea(double num) {
        return (4 * 3.1415 * (num*num));
    }
    
    public void Operate() {
        System.out.println("Area of Sphere = " + getSphereArea(subject.getValue()));
    }

}