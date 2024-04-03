public class Product {
    private static int counter = 0;
    private Integer id;
    private String name;
    private String manufacturer;
    private Double price;
    private Integer shelfLife;
    private Integer quantity;

    public Product() {
        this.id = ++counter;
        this.name = "";
        this.manufacturer = "";
        this.price = 0.0;
        this.shelfLife = 0;
        this.quantity = 0;
    }

    public Product(Integer id, String name, String manufacturer, Double price, Integer shelfLife, Integer quantity) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.shelfLife = shelfLife;
        this.quantity = quantity;
    }

    public Product(Integer id, String name, String manufacturer) {
        this(id, name, manufacturer, 0.0, 0, 0);
    }

    public Product(Product otherProduct) {
        this.id = otherProduct.id;
        this.name = otherProduct.name;
        this.manufacturer = otherProduct.manufacturer;
        this.price = otherProduct.price;
        this.shelfLife = otherProduct.shelfLife;
        this.quantity = otherProduct.quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(Integer shelfLife) {
        this.shelfLife = shelfLife;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", shelfLife=" + shelfLife +
                ", quantity=" + quantity +
                '}';
    }
}
