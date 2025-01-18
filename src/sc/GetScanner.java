package sc;

import java.util.Scanner;

public class GetScanner {
    static String name;
    static String product;
    static String address;
    static double price;
    final static String CURRENCY = "EUR";

    public static void main(String[] args) {
        GetScanner get = new GetScanner();
        Scanner scanner = new Scanner(System.in);

        get.getInfo();
        System.out.print("Client: ");
        name = scanner.nextLine().trim();

        while (!name.equals("stop")) {

            System.out.print("Product: ");
            product = scanner.nextLine();

            System.out.print("Address: ");
             address = scanner.nextLine();

            System.out.print("Price: ");
             price = scanner.nextDouble();

            System.out.println("-----------------------------------------------------------------------------");
            get.getOutput();
            scanner.nextLine();
            get.getInfo();
            System.out.print("Client: ");
            name = scanner.nextLine().trim();
        }
        scanner.close();
    }

     void getOutput() {
        System.out.println("Input Name: " + name + "\n" + "Input product: " + product + "\n" + "Input address: " + address +
                "\n" + "Input price: " + price + " " + CURRENCY);
    }
     void getInfo(){
        System.out.print("""
                ----------------------------------------------------------------------------- \
                
                ORDER\s
                Enter your name or "stop" for the end of program\n""");

    }
}