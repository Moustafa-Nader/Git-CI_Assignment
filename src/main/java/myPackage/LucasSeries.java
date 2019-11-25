package myPackage;

public class LucasSeries extends SubThread {
  
    public static double getLucasSeries(double x) {
        
           if (x == 0){ 
            return 2;} 
           if (x == 1){ 
            return 1;} 
  
         
        return (getLucasSeries(x - 1) + getLucasSeries(x - 2) );
       
    }
    
    
    public void Operate() {
        System.out.println("Lucas Series = " + getLucasSeries(subject.getValue()));
    }

}