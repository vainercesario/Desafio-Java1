package com.vainercesario.desafio1.desafio1.services;

import org.springframework.stereotype.Service;

import com.vainercesario.desafio1.desafio1.entities.Order;

@Service
public class ShippingService {
    public double shipment(Order order) {
        if (order.getBasic() < 100) {
            return 20;
        }
        if (order.getBasic() > 100 && order.getBasic() < 200) {
            return 12;
        }

        return 0;

    }
}
