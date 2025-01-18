package app;

public class AppController {
    static String clientName;
    static String product;
    static double price;
    static String address;
    final static String CURRENCY = "$";
    static int count;
    public static void getOutput() {
        System.out.println("Order №" + count + " Name of Client: "  + clientName +
                ", \nProduct: " + product + ", \nPrice of product: " + CURRENCY + price +
                ", \nAddress:  " + address);
    }
    public static void inputViktoria(){
        count++;
        clientName = "Viktoria";
        product = "fridge";
        price = 1223.74;
        address = "Sun street, 29";
    }
    public  static void inputDen(){
        count++;
        clientName = "Den";
        product = "TV";
        price = 12273.19;
        address = "Fog street, 58";
    }
}
