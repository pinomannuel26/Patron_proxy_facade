
package co.unicauca.patronproxy.access;

/**
 *
 * @author Mannuel Fernando Granoble Pino   cod: 104616021474
 * @author Michel Andrea Gutierrez Vallejo  cod: 104616020302
 */
public class Factory {
    
    private static Factory instance;

    private Factory() {
    }
    /**
     * Clase singleton
     *
     * @return
     */
    public static Factory getInstance() {

        if (instance == null) {
            instance = new Factory();
        }
        return instance;

    }
    /**
     * Método que crea una instancia concreta de la jerarquia IOrderRepository
     *
     * @return una clase hija de la abstracción IOrderRepository
     */
    public IOrderRepository getRepository(String type) {

        OrderRepositoryImplArrays result = null;
        
        switch (type) {
            case "Default":
                result = new OrderRepositoryImplArrays();
                break;
        }

        return result;

    }
    
}
