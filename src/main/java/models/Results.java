package models;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Results {
    private NumberFormat numberFormat;
    private BigDecimal regularAmount;
    private BigDecimal lastAmount;

    public Results(BigDecimal regularAmount, BigDecimal lastAmount) {
        this.regularAmount = regularAmount;
        this.lastAmount = lastAmount;
        numberFormat = NumberFormat.getCurrencyInstance(Locale.UK);
    }

    public BigDecimal getRegularAmount() {
        return regularAmount;
    }

    public void setRegularAmount(BigDecimal regularAmount) {

        this.regularAmount = regularAmount;
    }

    public BigDecimal getLastAmount() {
        return lastAmount;
    }

    public void setLastAmount(BigDecimal lastAmount) {
        this.lastAmount = lastAmount;
    }

    @Override
    public String toString() {
        if (getLastAmount().equals(getRegularAmount())) {
            return "Regular amount : [" + numberFormat.format(getRegularAmount())+"]";
        } else {
            return "Regular amount : [" + numberFormat.format(getRegularAmount()) + "]" +
                    "\nLast amount : [" + numberFormat.format(getLastAmount()) + "]";
        }
    }
}
