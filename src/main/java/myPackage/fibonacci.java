package myPackage;

public class fibonacci  extends SubThread {
	static double getfibonacci (double num) 
    { 
    if (num <= 1) 
       return num; 
    return getfibonacci (num-1) + getfibonacci (num-2); 
    } 
	  public void Operate() {
	        
			System.out.println("fibonacci  = " + getfibonacci (subject.getValue()));
	    }
	
	
}
