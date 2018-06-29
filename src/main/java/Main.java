import exception.PaymentsException;
import exception.PriceException;
import models.Results;
import utils.BigDecimalCalculate;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Read the input from user with scanner
        Scanner scanner = new Scanner(System.in);
        //Store the price the given from user
        String price;
        //Store the number of payments the given from user
        int payments;

        try {
            System.out.print("Total amount : ");
            price = scanner.nextLine();
            System.out.print("Number of payments : ");
            payments = scanner.nextInt();

            //Store the object Result that return the Calculate method
            Results returnAmount = BigDecimalCalculate.calculate(price, payments);
            System.out.println(returnAmount);
        } catch (PriceException | InputMismatchException | PaymentsException | NumberFormatException e) {
            //In real project we should use Logger
            System.out.println(e);
        }


    }
}
