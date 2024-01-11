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
        productPrices.put("Shoes", 15.0);
        productPrices.put("Hats", 20.0);
        productPrices.put("Tops", 10.0);
        productPrices.put("Jumpers", 35.0);
        productPrices.put("Socks", 5.0);
        productPrices.put("Belts", 9.0);
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
