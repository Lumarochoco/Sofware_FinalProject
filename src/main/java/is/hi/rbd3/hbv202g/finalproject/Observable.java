package is.hi.rbd3.hbv202g.finalproject;

import java.util.ArrayList;
import java.util.List;

public class Observable {

    private List<Observer> observers;
    public Observable() {
        observers=new ArrayList<Observer>();
    }
    public void attach(Observer observer) {
        observers.add(observer);
    }
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
