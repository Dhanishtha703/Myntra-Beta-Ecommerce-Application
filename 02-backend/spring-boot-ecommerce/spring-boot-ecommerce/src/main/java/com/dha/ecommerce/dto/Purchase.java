package com.dha.ecommerce.dto;

import com.dha.ecommerce.entity.Address;
import com.dha.ecommerce.entity.Customer;
import com.dha.ecommerce.entity.Order;
import com.dha.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
