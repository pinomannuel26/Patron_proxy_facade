/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.patronproxy.test;

import co.unicauca.patronproxy.domain.order.Customer;
import co.unicauca.patronproxy.domain.order.Dish;
import co.unicauca.patronproxy.domain.order.OrderFacade;
import co.unicauca.patronproxy.domain.order.State;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mannuel Fernando Granoble Pino   cod: 104616021474
 * @author Michel Andrea Gutierrez Vallejo  cod: 104616020302
 */
public class OrderFacadeTest {
    
    @Test
    public void testCreateOrder() {
        OrderFacade facade = new OrderFacade();
        facade.createOrder(new Customer(1, "Carlos Sanchez", "Calle 12 No. 12-12 BarrioCaldas", "3115677899", "Popayán"));
        facade.addDish(new Dish(1, "Hamburguesa vegetariana", 5000), 2);
        facade.addDish(new Dish(2, "Hamburguesa sencilla ", 4000), 3);
        facade.addDish(new Dish(3, "Jugo hit ", 1000), 2);
        assertEquals("Hamburguesa vegetariana",
        facade.getOrder().getDetails().get(0).getDish().getName());
        assertEquals(State.NEW, facade.getOrder().getState());
        facade.changeState(State.FINALIZED);
        assertEquals(State.FINALIZED, facade.getOrder().getState());
        assertEquals(3, facade.totalDishes());
        assertEquals(24000, facade.calculateTotal());
        facade.cancelOrder();
        facade.changeState(State.CANCELLED);
    }

}
