package atu.orderservive;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class OrderService {

    private static final double DEFAULT_PRICE = 10.0;
    private static final Map<String, Double> PRODUCT_PRICES = initializeProductPrices();

    private static Map<String, Double> initializeProductPrices() {
        Map<String, Double> productPrices = new HashMap<>();
        productPrices.put("productA", 15.0);
        productPrices.put("productB", 20.0);
        productPrices.put("productC", 25.0);
        return productPrices;
    }

    public double calculatePrice(@Valid OrderDetails orderDetails) {
        double unitPrice = getProductPrice(orderDetails.getProductType());
        return unitPrice * orderDetails.getQuantity();
    }

    private double getProductPrice(String productType) {
        return PRODUCT_PRICES.getOrDefault(productType, DEFAULT_PRICE);
    }
}
