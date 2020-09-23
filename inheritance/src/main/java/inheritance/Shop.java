package inheritance;

public class Shop extends Restaurant {
    private String description;

    public Shop(String name, int priceCategory, String description) {
        super(name, priceCategory);
        this.description = description;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + this.getName() + '\'' +
                ", description='" + description + '\'' +
                ", priceCategory=" + this.getPriceCategory() +
                '}';
    }

    public String getDescription() {
        return description;
    }
}
