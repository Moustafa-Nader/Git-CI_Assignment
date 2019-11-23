package myPackage;
public class CircleCircumference extends Thread implements ISubscriber{
Subject subject;
public Object obj = new Object();

@Override
public void Start(){
    start();
}
public void Notify(){
    synchronized(obj){
        obj.notify();
    }

}
public void setSubject(Subject subject){
    this.subject = subject;
}
public static double getCircleCircumference(double num){
    return (2*3.1415*num);
}
public void Operate(){
    System.out.println("Circle Circumference = " + getCircleCircumference(subject.getValue()));
}

@Override
public void run(){
try {
    synchronized(obj){
        obj.wait();
    }
}catch(InterruptedException e){
    e.printStackTrace();
}

Operate();
}



}