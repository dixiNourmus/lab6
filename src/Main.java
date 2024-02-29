import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double itemprice = 0;
        double shippingCost = 1.02;
        double totalPrice = 0;
        String moreItems = "";
        String trash = "";
        boolean done = false;

        do{
            System.out.println("cost of item");
            if (scanner.hasNextDouble()){
                itemprice = scanner.nextDouble();
                scanner.nextLine();
                totalPrice = totalPrice + itemprice;

                System.out.println("any more?");
                moreItems = scanner.nextLine();
                if (moreItems.equalsIgnoreCase("y")){
                    System.out.println("ok");

                }else if (moreItems.equalsIgnoreCase("n")){
                    System.out.println("your total is "+totalPrice);
                    done = true;

                }else {
                    System.out.println("not a y or n");
                }
            }

        }while(!done);
        if (totalPrice >= 100){
            System.out.println("free shipping!!" + totalPrice);
        }else if (totalPrice <= 100){
            totalPrice = shippingCost *totalPrice;
            System.out.println("your total is "+totalPrice);
        }

    }
}