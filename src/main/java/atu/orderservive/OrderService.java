package atu.orderservive;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public String confirmOrder(OrderDetails orderDetails){
        return String.format("Received Order for %.2f Euro", orderDetails.getCost());
    }
}
