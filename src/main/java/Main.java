import exception.PaymentsException;
import exception.PriceException;
import models.Results;
import utils.BigDecimalCalculate;

import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        //Store the price the given from user
        String price;
        //Store the number of payments the given from user
        int payments;

        try {

            if (args.length == 0 || args[0].trim().equals("")) {
                throw new PriceException("Please input a valid Total price");
            } else if (args.length == 1 || args[1].trim().equals("")) {
                throw new PaymentsException("Please input a valid Payments number");
            }
            //Get price from input args
            price = args[0];
            //Get payments from input args
            payments = Integer.parseInt(args[1]);


            //Store the object Result that return the Calculate method
            Results returnAmount = BigDecimalCalculate.calculate(price, payments);
            System.out.println(returnAmount);
        } catch (PriceException | InputMismatchException | PaymentsException | NumberFormatException e) {
            //In real project we should use Logger
            System.out.println(e);
        }
    }
}
