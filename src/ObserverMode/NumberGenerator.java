package ObserverMode;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by leon on 2017/7/28.
 */
public abstract class NumberGenerator {
    private ArrayList<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void deleteObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        Iterator it = observers.iterator();
        while (it.hasNext()){
            Observer observer = (Observer)it.next();
            observer.update(this);
        }
    }

    public abstract int getNumber();
    public abstract void execute();
}
