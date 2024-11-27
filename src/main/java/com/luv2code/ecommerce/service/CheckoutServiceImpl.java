package com.luv2code.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.ecommerce.dao.CustomerRepository;
import com.luv2code.ecommerce.dto.Purchase;
import com.luv2code.ecommerce.dto.PurchaseResponse;
import com.luv2code.ecommerce.entity.Order;

import jakarta.transaction.Transactional;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    private CustomerRepository customerRepository;

    @Autowired
    public CheckoutServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {
        
        // retrieve the order info from dto
        Order order = purchase.getOrder();

        // generate tracking number
        String orderTrackingNumber = generateOrderTrackingNumber();
                order.setOrderTrackingNumber(orderTrackingNumber);
        
                // populate order with orderItems
        
                // populate order with billingAddress and shippingAddress
        
                // populate customer with order
        
                // save to the database
        
                //return a response
        
                return null;
            }
        
            private String generateOrderTrackingNumber() {
                
                // generate a random UUID number (UUID version-4)
                // For details see: https://en.wikipedia.org/wiki/Universally_unique_identifier
                //
            }

}
