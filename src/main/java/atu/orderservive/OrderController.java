package atu.orderservive;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/calculatePrice")
    public double calculatePrice(@Valid @RequestBody OrderDetails orderDetails) {
        return orderService.calculatePrice(orderDetails);
    }
}