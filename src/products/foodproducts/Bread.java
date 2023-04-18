package products.foodproducts;

import products.FoodProducts;

public class Bread extends FoodProducts {
    public Bread(String title, Double price, Integer quantity, String unitOfMeasure, String expirationDate, String flour) {
        super(title, price, quantity, unitOfMeasure, expirationDate);
        this.flour = flour;
    }

    private String flour;

    public String getFlour() {
        return flour;
    }

    @Override
    public String toString() {
        return super.toString() + ", Тип муки: " + getFlour();
    }
}
