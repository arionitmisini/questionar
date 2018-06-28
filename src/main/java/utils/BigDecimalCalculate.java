package utils;

import exception.PaymentsException;
import exception.PriceException;
import models.Results;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalCalculate {

    public static Results calculate(String totalPrice, int payments) throws PriceException, PaymentsException {
        //Check if price is empty
        if (totalPrice.isEmpty()) {
            //Throw exception if codition it's true
            throw new PriceException("The price is empty");
        }

        //Check if payments number is less or equals than 0
        if (payments <= 0) {
            //Throw exception if codition it's true
            throw new PaymentsException("The payment it's less or equals than 0");
        }

        BigDecimal price = new BigDecimal(totalPrice);

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




