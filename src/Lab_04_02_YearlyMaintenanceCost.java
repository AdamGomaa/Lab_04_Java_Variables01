import java.util.Scanner;

public class Lab_04_02_YearlyMaintenanceCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the cost for summer: ");
        double summerCost = scanner.nextDouble();
        System.out.print("Enter the Cost for spring: ");
        double springCost = scanner.nextDouble();
        System.out.print("Enter the Cost for winter: ");
        double winterCost = scanner.nextDouble();
        System.out.print("Enter the Cost for fall: ");
        double fallCost =  scanner.nextDouble();
        double yearlyCost = summerCost + springCost + winterCost + fallCost;
        System.out.println("Summer Maintenance Cost: $" + summerCost);
        System.out.println("Spring Maintenance Cost: $" + springCost);
        System.out.println("Winter Maintenance Cost: $" + winterCost);
        System.out.println("Fall Maintenance Cost: $" + fallCost);
        System.out.println("Total Yearly Maintenance Cost: $" + yearlyCost);
    }
}
