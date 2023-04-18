package products.foodproducts;

import products.FoodProducts;

public class Milk extends FoodProducts {
    public Milk(String title, Double price, Integer quantity, String unitOfMeasure, String expirationDate, Double fat) {
        super(title, price, quantity, unitOfMeasure, expirationDate);
        this.fat = fat;
    }

    private Double fat;

    public Double getFat() {
        return fat;
    }

    @Override
    public String toString() {
        return super.toString() + ", Процент жирности: " + getFat() + " %";
    }
}
