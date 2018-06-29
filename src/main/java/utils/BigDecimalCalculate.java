package utils;

import exception.PaymentsException;
import exception.PriceException;
import models.Results;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalCalculate {

    public static Results calculate(String totalPrice, int payments) throws PriceException, PaymentsException {
        //Create a BigDecimal price because BigDecimal is immutable and we can't change the value, we can just create new Obj
        BigDecimal price = new BigDecimal(totalPrice);

        //Check if price is empty
        if (price.compareTo(BigDecimal.ZERO) == 0) {
            //Throw exception if condition it's true
            throw new PriceException("The price is less or equals than 0");
        }
        //Check if payments number is less or equals than 0
        if (payments <= 0) {
            //Throw exception if condition it's true
            throw new PaymentsException("The payment it's less or equals than 0");
        }

        //Save the divide with price and payments
        BigDecimal regularAmount = price.divide(new BigDecimal(payments), 2, RoundingMode.DOWN);

        //Save the latest value of price by multiplying the price to payment - 1, to help us to find the latest amount
        BigDecimal endPrice = regularAmount.multiply(new BigDecimal(--payments));

        //Save the the total price for latest amount
        BigDecimal lastAmount = price.subtract(endPrice);

        //Return the new Results object with regularAmount and latestAmount parameters.
        return new Results(regularAmount, lastAmount);
    }
}




