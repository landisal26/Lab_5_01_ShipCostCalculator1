public class Main {
    public static void main(String[] args) {
        double itemprice = 100.75;
        double shipping = itemprice * 0.02;

        if (itemprice >= 100)
        {
            System.out.println("Your order is over $100 so shipping is $0.00");
        }
        else
        {
            System.out.println("Your order is less than $100");
            System.out.println("Your shipping cost is $" +shipping);
            System.out.println("Your total is $" +(itemprice +shipping));
        }
    }
}