package products;

public class FoodProducts extends Products {
    public FoodProducts(String title, Double price, Integer quantity, String unitOfMeasure, String expirationDate) {
        super(title, price, quantity, unitOfMeasure);
        this.expirationDate = expirationDate;
    }

    private String expirationDate;

    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Срок годности: до " + getExpirationDate();
    }
}
