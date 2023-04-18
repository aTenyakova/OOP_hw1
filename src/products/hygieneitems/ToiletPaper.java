package products.hygieneitems;

import products.HygieneItems;

public class ToiletPaper extends HygieneItems {
    public ToiletPaper(String title, Double price, Integer quantity, String unitOfMeasure, Integer units, Integer numberOfLayers) {
        super(title, price, quantity, unitOfMeasure, units);
        this.numberOfLayers = numberOfLayers;
    }

    private int numberOfLayers;

    public int getNumberOfLayers() {
        return numberOfLayers;
    }

    @Override
    public String toString() {
        return super.toString() + ", Количество слоёв: " + getNumberOfLayers();
    }
}
