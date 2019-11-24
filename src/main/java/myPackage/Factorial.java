package myPackage;

public class Factorial extends SubThread {
  
    public static double getFactorial(double num) {
	int i,fact=1;
	for(i=1;i<=num;i++){    
		fact=fact*i;    
	}    
        return (fact);
    }

    public void Operate() {
        System.out.println("Factorial = " + getFactorial(subject.getValue()));
    }

}