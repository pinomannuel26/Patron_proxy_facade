/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.patronproxy.domain.order;

import co.unicauca.patronproxy.access.Factory;
import co.unicauca.patronproxy.access.IOrderRepository;

/**
 *
 * @author Mannuel Fernando Granoble Pino   cod: 104616021474
 * @author Michel Andrea Gutierrez Vallejo  cod: 104616020302
 */
public class ProxyClient {
    private IOrderService orderService;

    public ProxyClient(IOrderService orderService) {
        this.orderService = orderService;
    }
    public void createOrder()
    {
        IOrderRepository repo = Factory.getInstance().getRepository("Default");
        orderService.save(repo);
    }
    
}
