package product;

public class SoftProduct extends Product {
    private int sizeInmegabyte;

    public SoftProduct(String name, String description, double price,
                       double discount, int quantity, int sizeInmegabyte) {
        super(name, description, price, discount, quantity);
        this.sizeInmegabyte = sizeInmegabyte;
    }

    public int getSizeInmegabyte() {
        return sizeInmegabyte;
    }

    public void setSizeInmegabyte(int sizeInmegabyte) {
        this.sizeInmegabyte = sizeInmegabyte;
    }

    @Override
    public String toString() {
        return super.toString() + "SoftProduct{" +
                "sizeInmegabyte=" + sizeInmegabyte +
                '}';
    }

    public void demo(){
        System.out.println("want to see 2nd commit");
        System.out.println("after git");
        System.out.println("after 3");
    }
}
