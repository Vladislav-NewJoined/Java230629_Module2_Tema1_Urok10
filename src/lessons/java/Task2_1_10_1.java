package lessons.java;

import java.util.ArrayList;

public class Task2_1_10_1 {
    public static void main(String[] args) {
        System.out.println("Задание : \n1.\tНеобходимо вывести большими буквами названия всех " +
                "\nпродуктов из магазина электроники, написанного на уроке.\n\nРешение: ");
        ArrayList<Product> catalog = new ArrayList<>();

        catalog.add(new Product("Nokia 3310", 12345676));
        catalog.add(new Product("Samsung Galaxy S100", 50304));
        catalog.add(new Product("IPhone 20", 392049));
        catalog.add(new Product("Google Pixel 10a", 203421));
        catalog.stream().map((product -> product.name)).forEach(x -> System.out.println(x.toUpperCase()));
    }
}
class Product {
    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}