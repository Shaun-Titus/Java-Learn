import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char curency = '$';
        double total;

        System.out.print("What item would you like to buy: ");
        item = scanner.nextLine();

        System.out.print("What is the price: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like: ");
        quantity = scanner.nextInt();

        total = price*quantity;
        System.out.println("\n You have bought "+ quantity +" "+ item+"/s");
        System.out.println("Your Total is "+ curency+total);




        scanner.close();


    }


}

