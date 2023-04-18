package products;

public class Products {
    public Products(String title, Double price, Integer quantity, String unitOfMeasure) {
        this.title = title;
        this.price = price;
        this.quantity = quantity;
        this.unitOfMeasure = unitOfMeasure;
    }

    private String title;
    private Double price;
    private int quantity;
    private String unitOfMeasure;

    public String getTitle() {
        return title;
    }
    public Double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    @Override
    public String toString() {
        return "Наименование товара: " + getTitle() + ", Цена: " + getPrice() + " р., Количество: " + getQuantity() + " " + getUnitOfMeasure();
    }
}
