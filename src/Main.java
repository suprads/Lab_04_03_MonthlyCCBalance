public class Main {
    public static void main(String[] args)
    {
        int balance = 5000;
        double interestRate = 0.17;

        double oneMonthRate = balance + balance * interestRate;
        System.out.println("The interest due after one month is $" + oneMonthRate);

        double twoMonthRate = oneMonthRate + oneMonthRate * interestRate;
        System.out.println("The interest due after two months is $" + twoMonthRate);
    }
}