package observer_design_pattern.observer;

import observer_design_pattern.observable.stockOptions;

public class EmailNotification implements NotificationObserver {
    public String emailId;
    public stockOptions stock;
    public EmailNotification(String emailId, stockOptions stock){
        this.emailId = emailId;
        this.stock = stock;
    }

    public void update(){
        sendMail(this.emailId, "Stock item has been updated");   
    }

    public void sendMail(String email, String message){
        System.out.println(message + " sent to " + email);
    }

}
