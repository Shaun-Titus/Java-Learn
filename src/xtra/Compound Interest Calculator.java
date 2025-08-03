/*import java.util.Scanner;

public class Compound {
    public static void main(String[] args) {
        public static void main(String[] args){
        // Compound interest calculator

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char curency = '$';
        double total;
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("What item would you like to buy: ");
        item = scanner.nextLine();
        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("What is the price: ");
        price = scanner.nextDouble();
        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("How many would you like: ");
        quantity = scanner.nextInt();

        total = price*quantity;
        System.out.println("\n You have bought "+ quantity +" "+ item+"/s");
        System.out.println("Your Total is "+ curency+total);
        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d years is $%.2f", years, amount);

        scanner.close();


    }


}

}*/
