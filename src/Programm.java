import products.*;
import products.childrensproducts.*;
import products.drinks.*;
import products.foodproducts.*;
import products.hygieneitems.*;

import java.util.*;

public class Programm {
    public static void printAllProducts(List<Products> products) {
        for (Products product : products) {
            System.out.println(product.toString());
        }
    }

    public static void main(String[] args) {
        List<Products> products = new ArrayList<>();
        products.add(new Milk("Молоко", 68.00, 15, "шт.", "21.04.2023", 3.2));
        products.add(new Bread("Хлеб", 32.00, 30, "шт.", "20.04.2023", "Пшеничная"));
        products.add(new Eggs("Яйцо", 102.00, 10, "уп.", "01.05.2023", 10));

        products.add(new Lemonade("Лимонад", 85.00, 25, "шт.", 1000));

        products.add(new Masks("Маска", 180.00, 15, "уп.", 50));
        products.add(new ToiletPaper("Туалетная бумага", 99.90, 10, "уп.", 4, 2));

        products.add(new Diapers("Подгузники", 1179.00, 35, "уп.", 1, true,2, 4, 6, "Одноразовые"));
        products.add(new Nipple("Соска", 250.00, 20, "шт.", 0, true));

        printAllProducts(products);
    }
}
