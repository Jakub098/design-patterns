package obserwator.notification;

import obserwator.Order;

public class Email implements Observer {

    public void update(Order order) {
        System.out.println("Email - zamówienie numer: " + order.getOrderNumber() + " zmieniło status na " + order.getOrderStatus());
    }

}
