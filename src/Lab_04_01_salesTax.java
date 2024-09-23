import java.util.Scanner;

public class Lab_04_01_salesTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double taxRate = 5;
        System.out.println("Enter the price of the item: ");
        double price = scanner.nextDouble();
        double salesTax = price * (taxRate / 100);
        double totalPrice = price + salesTax;
        System.out.println("Sales Tax: $" + taxRate);
        System.out.println("Total Price: $" + totalPrice);
    }
}
