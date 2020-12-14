package chapter3;

import java.util.Scanner;

public class InvoiceTest {

    public static void main(String[] args) {

        Invoice chidiChioma = new Invoice("1a", "tyres", 4, 6000.00);

        System.out.printf("number is: %s%n", chidiChioma.getNumber());
        System.out.printf("Description is: %s%n", chidiChioma.getDescription());
        System.out.printf("Quantity purchased is: %d%n", chidiChioma.getQuantityPurchased());
        System.out.printf("Price per item is: %.2f%n", chidiChioma.getPricePerItem());

        Scanner input = new Scanner(System.in);

        System.out.println("Enter invoice number");  // prompt
        chidiChioma.setNumber(input.nextLine());

        System.out.println("Enter Description");
        chidiChioma.setDescription(input.nextLine());

        System.out.println("Enter quantity purchased");
        chidiChioma.setQuantityPurchased(input.nextInt());

        System.out.println("Enter price per item");
        chidiChioma.setPricePerItem(input.nextDouble());

        System.out.printf("Invoice amount is: %.2f%n" ,chidiChioma.invoiceAmount());


    }
}

