package myPackage;

public class CircleArea extends SubThread{
	public static double get_CircleArea(double r) {
		return (r*r*3.1415);
	}
	
	public void Operate() {
		 System.out.println("Circle Area = " + get_CircleArea(subject.getValue()));
	}
}