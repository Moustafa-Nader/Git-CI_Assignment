package myPackage;

public interface ISubscriber {
    //Start the function thread
    public void Start();
    //set the subject of this thread
    public void setSubject(Subject subject);
    //notify the thread that the value of the subject was updated
    public void Notify();
    //execute the thread's function
    public void Operate();

}