package be.nsi.spf;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

public class PriceCalculatorTest {

    private PriceCalculator priceCalculator;

    @BeforeEach
    public void setUp() {
        priceCalculator = new PriceCalculator();
    }

    @Test
    public void CalculatePrice_Should_Return_EmptyArrayList_As_calculationTrigger_Is_False() {

        //Arrange 
        double discountPercentage = 20.0;

        //Act
        ArrayList<Product> result = priceCalculator.calculatePrice(discountPercentage);

        //Assert
        assertTrue(result.size() == 0);
    }

    @Test
    public void CalculatePrice_Should_Return_EmptyArrayList_As_calculationTrigger_Is_True() {

        //Arrange 
        double discountPercentage = 20.0;

        //Act
        ArrayList<Product> result = priceCalculator.calculatePrice(discountPercentage);

        //Assert
        assertTrue(result.size() > 0);
    }
}
