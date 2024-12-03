package observer_design_pattern;

import observer_design_pattern.observable.iphoneStock;
import observer_design_pattern.observer.EmailNotification;

public class stock {
    public static void main(String[] args) {
        iphoneStock stock = new iphoneStock();
        EmailNotification notification = new EmailNotification("tanmay@xyz", stock);
        stock.add(notification);
        stock.update();
    }
}
