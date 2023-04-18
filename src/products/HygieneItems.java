package products;

public class HygieneItems extends Products {
    public HygieneItems(String title, Double price, Integer quantity, String unitOfMeasure, Integer units) {
        super(title, price, quantity, unitOfMeasure);
        this.units = units;
    }

    private int units;

    public int getUnits() {
        return units;
    }

    @Override
    public String toString() {
        return super.toString() + ", Количество штук в упаковке: " + getUnits();
    }
}
