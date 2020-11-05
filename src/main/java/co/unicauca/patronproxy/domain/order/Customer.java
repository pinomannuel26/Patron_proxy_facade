
package co.unicauca.patronproxy.domain.order;

/**
 *
 * @author Mannuel Fernando Granoble Pino   cod: 104616021474
 * @author Michel Andrea Gutierrez Vallejo  cod: 104616020302
 */
public class Customer {
    
    private int id;
    private String name;
    private String address;
    private String mobile;
    private String City;

    public Customer() {
    }

    public Customer(int id, String name, String address, String mobile, String City) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.City = City;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }
    
}
