package co.unicauca.patronproxy.domain.order;
import co.unicauca.patronproxy.access.IOrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 *Proxy de Logging
 * @author Mannuel Fernando Granoble Pino   cod: 104616021474
 * @author Michel Andrea Gutierrez Vallejo  cod: 104616020302
 */
public class OrderServiceLogger implements IOrderService {
    /* Referencia al sujeto real */
    private OrderFacade orderFacade;
    /* Logger */
    private Logger logger; 
    /* Constructor parametrizado*/

    public OrderServiceLogger() {
    }
    

    public OrderServiceLogger(OrderFacade orderFacade) {
        this.orderFacade = orderFacade;
        logger = LoggerFactory.getLogger(OrderServiceLogger.class);
    }
    /* Sobreescribimos la operacion para poder controlar el acceso al recurso original
    *  @param repo repositorio
    */

    @Override
    public void save(IOrderRepository repo) {
        
        repo.createOrder(orderFacade.getOrder());
        // se hace el logg
        String message = "Pedido guardado en la base de datos.";
        logger.info(message);
        
    }
    
}
