package products.foodproducts;

import products.FoodProducts;

public class Eggs extends FoodProducts {
    public Eggs(String title, Double price, Integer quantity, String unitOfMeasure, String expirationDate, Integer quantityInPackage) {
        super(title, price, quantity, unitOfMeasure, expirationDate);
        this.quantityInPackage = quantityInPackage;
    }

    private int quantityInPackage;

    public int getQuantityInPackage() {
        return quantityInPackage;
    }

    @Override
    public String toString() {
        return super.toString() + ", Количество в упаковке: " + getQuantityInPackage();
    }
}
