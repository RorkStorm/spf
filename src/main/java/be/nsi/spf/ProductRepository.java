package be.nsi.spf;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    List<Product> products = new ArrayList<>();

    public ProductRepository()
    {
        for (int i = 1; i <= 100; i++) {
            String name = "Product " + i;
            double price = i * 1.5; // Exemple de prix basé sur l'index
            products.add(new Product(name, price));
        }
    }

    public List<Product> findAll()
    {
        return products;
    }
}
