package br.com.devsenior.desafio_calcula_frete.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.devsenior.desafio_calcula_frete.entity.Order;

@Service
public class OrderService {
    
    @Autowired
    ShippingService shippingService;

    public double total(Order order) {
        double frete = shippingService.shipment(order);
        return order.valueAfterDiscount() + frete;
    }
}
