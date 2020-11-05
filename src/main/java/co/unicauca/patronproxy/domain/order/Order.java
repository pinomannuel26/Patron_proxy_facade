
package co.unicauca.patronproxy.domain.order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mannuel Fernando Granoble Pino   cod: 104616021474
 * @author Michel Andrea Gutierrez Vallejo  cod: 104616020302
 */
public class Order {
    
    private int despatch;
    private Customer customer;
    private LocalDate date;
    private State state;
    private List<Item> details;

    public Order() {
        details = new ArrayList<Item>();
        this.state = State.NEW;
    }

    public Order(Customer customer) {
        this.customer = customer;
        details = new ArrayList<Item>();
        this.state = State.NEW;

    }

    public int getDespatch() {
        return despatch;
    }

    public void setDespatch(int despatch) {
        this.despatch = despatch;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<Item> getDetails() {
        return details;
    }

    public void setDetails(List<Item> details) {
        this.details = details;
    }
    
    public void addDish(Dish dish, int amount)
    {
        Item varItem = new Item(dish,amount);
        details.add(varItem);
    }
    
    public double calculateTotal()
    {
        double suma =0;
        for (int i = 0; i < details.size(); i++) {
            
            double varPrice = details.get(i).getDish().getPrice();
            int varAmount = details.get(i).getAmount();
            suma = suma +(varPrice * varAmount);
            
        }
        return suma;
    }
}
