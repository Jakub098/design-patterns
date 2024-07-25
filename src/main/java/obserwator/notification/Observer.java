package obserwator.notification;

import obserwator.Order;

public interface Observer {
    void update(Order order);
}
