package obserwator;


import obserwator.notification.Email;
import obserwator.notification.TextMessage;

import java.util.Observer;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(110L, OrderStatus.ZAREJESTROWANE);
        TextMessage textMessage = new TextMessage();
        Email email = new Email();


        order.registerObserver(textMessage);
        order.registerObserver(email);

        order.notifyObservers();

        order.changeOrderStatus(OrderStatus.WYSŁANE);
        System.out.println("-------------------");
        order.notifyObservers();


    }
}
