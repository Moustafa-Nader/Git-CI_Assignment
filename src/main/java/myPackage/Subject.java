package myPackage;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<ISubscriber> subscribers;
    public double value;
    //Subject's constructor with the new list of the subscribers
    public Subject() {
        subscribers = new ArrayList<ISubscriber>();
    }
    //assign a new subscriber to the subject
    public void addSubscriber(ISubscriber sub) {
        subscribers.add(sub);
    }
    //getter for the value of the subject
    public double getValue() {
        return this.value;
    }
    //set the subject's value
    public void setValue(double value) {
        this.value = value;
        //notify all the subscribers about the new value
        updateSubscribers();
    }
    //getter for the subscribers
    public List<ISubscriber> getSubscribers() {
        return subscribers;
    }
    //the update subscriber function
    public void updateSubscribers() {
        for (ISubscriber sub : this.getSubscribers())
            sub.Notify();
    }

}