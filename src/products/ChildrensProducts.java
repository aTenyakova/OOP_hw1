package products;

public class ChildrensProducts extends Products {
    public ChildrensProducts(String title, Double price, Integer quantity, String unitOfMeasure, Integer minAge, Boolean hypoallergenic) {
        super(title, price, quantity, unitOfMeasure);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }

    private int minAge;
    private Boolean hypoallergenic;

    public int getMinAge() {
        return minAge;
    }

    public boolean isHypoallergenic() {
        return hypoallergenic;
    }

    @Override
    public String toString() {
        return super.toString() + ", Минимальный возраст: " + getMinAge() + " мес., Гипоаллергенность: " +
                (isHypoallergenic() ? "Да" : "Нет");
    }
}
