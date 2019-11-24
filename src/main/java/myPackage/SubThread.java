package myPackage;

public abstract class SubThread extends Thread implements ISubscriber{
    Subject subject;
    public Object obj = new Object();

    @Override
    public void Start() {
        start();
    }
    //notify the thread that the subject's value has changed
    public void Notify() {
        synchronized (obj) {
            obj.notify();
        }
    }
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void run() {
        try {
            synchronized (obj) {
                obj.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //run the function
        Operate();
    }
}