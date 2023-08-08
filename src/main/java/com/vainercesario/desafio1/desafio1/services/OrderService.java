package com.vainercesario.desafio1.desafio1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vainercesario.desafio1.desafio1.entities.Order;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public String total(Order order) {

        var valor = order.getBasic() - (order.getBasic() * (order.getDiscount() / 100))
                + shippingService.shipment(order);

        return String.format("Pedido código %d %nValor total: R$ %.2f", order.getCode(), valor);
    }
}
