package br.com.devsenior.desafio_calcula_frete.service;

import org.springframework.stereotype.Service;

import br.com.devsenior.desafio_calcula_frete.entity.Order;

@Service
public class ShippingService {
    
    public double shipment(Order order) {
        double frete = 0.0;
        if (order.valueAfterDiscount() < 100){
            frete = 20.0;
        } else if (order.valueAfterDiscount() > 100 && order.valueAfterDiscount() < 200) {
            frete = 12.0;
        }
        return frete;
        
    }
}
