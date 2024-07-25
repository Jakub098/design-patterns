package obserwator.notification;

import obserwator.Order;

public class TextMessage implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("Zamówineie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}
