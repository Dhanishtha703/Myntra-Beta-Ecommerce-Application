package com.dha.ecommerce.service;

import com.dha.ecommerce.dto.Purchase;
import com.dha.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
