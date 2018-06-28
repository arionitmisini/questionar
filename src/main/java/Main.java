import exception.PaymentsException;
import exception.PriceException;
import models.Results;
import utils.BigDecimalCalculate;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Store the price the given from user
        String price;
        //Store the number of payments the given from user
        int payments;

        //Read the input with scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Total amount : ");
        price = scanner.nextLine();
        System.out.print("Number of payments : ");
        payments = scanner.nextInt();

        try {
            //Store the object Result that return the Calculate method
            Results returnAmount = BigDecimalCalculate.calculate(price, payments);
            System.out.println(returnAmount);
        } catch (PriceException e) {
            //In real project we should use Logger
            System.out.println(e);
        } catch (PaymentsException e) {
            System.out.println(e);
        } catch (InputMismatchException e) {
            System.out.println(e);
        } catch (NumberFormatException e){
            System.out.println(e);
        }


    }
}
