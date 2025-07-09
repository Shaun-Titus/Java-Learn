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

        System.out.println(item);




        scanner.close();


    }


}

