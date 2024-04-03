public class Medicine extends Base {
    private String manufacturer;
    public Medicine() {
        super();
    }
    public Medicine(Integer id, String name, String manufacturer, String
            description) {
        super(id, name, description);
        this.manufacturer = manufacturer;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    @Override
    public String getDetails() {
        return "Medicine{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", description='" + getDescription() + '\'' +
                '}';
    }
}