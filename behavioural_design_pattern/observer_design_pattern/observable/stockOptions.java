package observer_design_pattern.observable;

import observer_design_pattern.observer.NotificationObserver;

public interface stockOptions {
    public void add(NotificationObserver observer);
    public void remove(NotificationObserver observer);
    public void update();
    public void setData(int stockNumber);
}
