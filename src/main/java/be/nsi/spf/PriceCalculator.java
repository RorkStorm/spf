package be.nsi.spf;

import java.time.LocalDate;
import java.util.ArrayList;

public class PriceCalculator {

    private boolean calculationTrigger;

    public PriceCalculator() {
        calculationTrigger = checkCalculationTriggerForDiscountMonths();
    }

    public ArrayList<Product> calculatePrice(double discountPercentage) {
        
        ArrayList<Product> products = new ArrayList<>();

        if(calculationTrigger)
        {
            ProductRepository repo = new ProductRepository();

            for (Product product : repo.findAll()) {
                Product temp = new Product(product.getName(), product.getPrice() * (1 - discountPercentage / 100));
                products.add(temp);
            }
        }

        return products;

    }

    private boolean checkCalculationTriggerForDiscountMonths() {
        LocalDate currentDate = LocalDate.now();
        int currentMonth = currentDate.getMonthValue();
        return currentMonth == 1 && currentMonth == 7;
    }
}
