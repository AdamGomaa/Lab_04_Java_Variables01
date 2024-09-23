public class Lab_04_03_MonthlyCCBalance {
    public static void main(String[] args) {
        double accountBalance = 5000.00;
        double interestRate = 0.17;
        double oneMonth = 0;
        double twoMonth = 0;
        oneMonth = accountBalance * interestRate;
        twoMonth = oneMonth * 2;
        System.out.println("The interest rate for one month is: $" + oneMonth);
        System.out.println("The interest rate for two months is: $" + twoMonth);
    }
}
