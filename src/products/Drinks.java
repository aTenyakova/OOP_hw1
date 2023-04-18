package products;

public class Drinks extends Products {
    public Drinks(String title, Double price, Integer quantity, String unitOfMeasure, Integer volume){
        super(title, price, quantity, unitOfMeasure);
        this.volume = volume;
    }

    private int volume;

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return super.toString() + ", Объем: " + getVolume() + " мл";
    }
}
