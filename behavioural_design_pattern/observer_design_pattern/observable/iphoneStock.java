package observer_design_pattern.observable;

import java.util.ArrayList;
import java.util.List;

import observer_design_pattern.observable.stockOptions;
import observer_design_pattern.observer.NotificationObserver;

public class iphoneStock implements stockOptions {
    public int stockCount=0;
    public List <NotificationObserver> observers = new ArrayList<NotificationObserver>();

    @Override
    public void add (NotificationObserver observer){
        observers.add(observer);
    }

    @Override
    public void remove (NotificationObserver observer){
        observers.remove(observer);
    }

    @Override
    public void update(){
        for (NotificationObserver observer : observers){
            observer.update();
        }
    }

    @Override
    public void setData(int newStockNumber){
        if (stockCount==0){
            update();
        }
        stockCount+= newStockNumber;
    }

    public int getStock() {
        return stockCount;
    }
}
