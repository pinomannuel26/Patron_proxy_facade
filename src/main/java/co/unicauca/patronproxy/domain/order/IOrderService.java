
package co.unicauca.patronproxy.domain.order;

import co.unicauca.patronproxy.access.IOrderRepository;

/**
 *
 * @author Mannuel Fernando Granoble Pino   cod: 104616021474
 * @author Michel Andrea Gutierrez Vallejo  cod: 104616020302
 * Suejto(subject).
 * 
 * Interfaz que debe ser implementada tanto por los proxy como por los sijetos que realizan la operacion.
 */
public interface IOrderService {
    
    public void save(IOrderRepository repo);
}
