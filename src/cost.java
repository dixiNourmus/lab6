import java.util.Scanner;

public class cost {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        double width;
        double height;
        double cost;
        double squareFt;
        double totalCost;

        String trash = "";

        while(true){
            System.out.println("Width: ");
            if (in.hasNextDouble()){
                width = in.nextDouble();
                in.nextLine();
                break;
            }
            else {
                trash = in.nextLine();
                System.out.println("thats not a valid width");

            }
        }

        while(true){
            System.out.println("height: ");
            if (in.hasNextDouble()){
                height = in.nextDouble();
                in.nextLine();
                break;
            }
            else {
                trash = in.nextLine();
                System.out.println("thats not a valid height");

            }
        }

        while(true){
            System.out.println("cost: ");
            if (in.hasNextDouble()){
                cost = in.nextDouble();
                in.nextLine();
                break;
            }
            else {
                trash = in.nextLine();
                System.out.println("thats not a valid cost");

            }
        }
        squareFt = height * width;
        totalCost = squareFt * cost;
        System.out.println("your total cost is "+totalCost);




    }

}
