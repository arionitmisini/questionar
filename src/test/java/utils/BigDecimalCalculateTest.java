package utils;

import exception.PaymentsException;
import exception.PriceException;
import models.Results;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class BigDecimalCalculateTest {

    @Test
    public void calculateShouldPrintOnlyRegularAmount() throws PriceException, PaymentsException {
        Results calculate = BigDecimalCalculate.calculate("10", 2);

        BigDecimal bigDecimal = new BigDecimal("5.00");

        assertEquals(calculate.getRegularAmount(), bigDecimal);
    }

    @Test
    public void calculateShouldPrintRegularAmountAndLastAmount() throws PriceException, PaymentsException {
        Results calculate = BigDecimalCalculate.calculate("10", 3);

        BigDecimal regularAmount = new BigDecimal("3.33");
        BigDecimal lastAmount = new BigDecimal("3.34");

        assertEquals(calculate.getRegularAmount(), regularAmount);
        assertEquals(calculate.getLastAmount(), lastAmount);
    }

    @Test(expected = PriceException.class)
    public void calculateShouldThrowPriceExeptionWhenTotalPriceValueIsLessThenZero() throws PriceException, PaymentsException {
        BigDecimalCalculate.calculate("0", 3);

    }

    @Test(expected = PaymentsException.class)
    public void calculateShouldThrowPaymentExeptionWhenPaymentsValueIsLessThenZero() throws PriceException, PaymentsException {
        BigDecimalCalculate.calculate("10", 0);

    }

    @Test(expected = NumberFormatException.class)
    public void calculateShouldThrowNumberFormatExeptionWhenTotalPriceValueHasAnInvalidCharacter() throws PriceException, PaymentsException {
        BigDecimalCalculate.calculate("323aa", 0);

    }

}