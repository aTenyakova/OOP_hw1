package products.childrensproducts;

import products.ChildrensProducts;

public class Diapers extends ChildrensProducts {
    public Diapers(String title, Double price, Integer quantity, String unitOfMeasure, Integer minAge, Boolean hypoallergenic, Integer size, Integer minWeight, Integer maxWeight, String type) {
        super(title, price, quantity, unitOfMeasure, minAge, hypoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    private int size;
    private int minWeight;
    private int maxWeight;
    private String type;

    public int getSize() {
        return size;
    }
    public int getMinWeight() {
        return minWeight;
    }
    public int getMaxWeight() {
        return maxWeight;
    }
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString() + ", Размер: " + getSize() + ", Минимальный вес: " + getMinWeight() + " кг, Максимальный вес: " + getMaxWeight() + " кг, Тип: " + getType();
    }
}
