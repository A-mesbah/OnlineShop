package product;
public abstract class Product {
    private String name;
    private String description;
    // private BufferedImage;
    private double price;
    private double discount;
    private int quantity;

    public Product(String name, String description, double price, double discount, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.discount = discount;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", quantity=" + quantity +
                '}';
    }
}

