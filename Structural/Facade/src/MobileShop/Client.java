package MobileShop;

import java.util.Scanner;

public class Client {
    private static int choice;

    public static void main(String args[]) {
            System.out.println("========= Mobile Shop ============");
            System.out.println("1. IPHONE");
            System.out.println("2. SAMSUNG");
            System.out.println("3. NOKIA.");
            System.out.println("4. Exit.");
            System.out.print("Enter your choice: ");

            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            Shopkeeper shopKeeper = new Shopkeeper();

//            shopKeeper.getDetails(choice);
    }
}
