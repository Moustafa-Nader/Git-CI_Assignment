package myPackage;

public class Sum extends SubThread {
  
    public static double getSum(double num) {
	int i,sum=0;
	for(i=0;i<=num;i++){    
		sum=sum+i;    
	}    
        return (sum);
    }

    public void Operate() {
        System.out.println("Sum = " + getSum(subject.getValue()));
    }

}