package myPackage;

import java.util.ArrayList;
import java.util.List;

public class Subject{
private List<ISubscriber> subscribers;
public double value;

public Subject(){
    subscribers = new ArrayList<ISubscriber>();
}
public void addSubscriber(ISubscriber sub){
    subscribers.add(sub);
}
public double getValue(){
    return this.value;
}
public void setValue(double value){
    this.value = value;
    updateSubscribers();
}
public List<ISubscriber> getSubscribers(){
    return subscribers;
}
public void updateSubscribers(){
    for(ISubscriber sub : this.getSubscribers())
    sub.Notify();
}

}