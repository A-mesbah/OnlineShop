package product;


public class HardProduct extends Product {
    private String deliveryAdress;

    public HardProduct(String name, String description, double price, double discount, int quantity,
                       String deliveryAdress) {
        super(name, description, price, discount, quantity);
        this.deliveryAdress = deliveryAdress;
    }

    public String getDeliveryAdress() {
        return deliveryAdress;
    }

    public void setDeliveryAdress(String deliveryAdress) {
        this.deliveryAdress = deliveryAdress;
    }

    @Override
    public String toString() {
        return super.toString() + "HardProduct{" +
                "deliveryAdress='" + deliveryAdress + '\'' +
                '}';
    }
}