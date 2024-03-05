import java.util.Scanner;

public class compaire {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1;
        double num2;
        String trash = "";


        while (true) {
            System.out.println("whats the first number?");
            if (in.hasNextDouble()) {
                num1 = in.nextDouble();
                in.nextLine();
                break;
            } else {
                trash = in.nextLine();
                System.out.println("thats not a valid number");

            }


        }

        while (true) {
            System.out.println("whats the second number?");
            if (in.hasNextDouble()) {
                num2 = in.nextDouble();
                in.nextLine();
                break;
            } else {
                trash = in.nextLine();
                System.out.println("thats not a valid number");


            }
        }
        if (num1 > num2){
            System.out.println(num1 + " is bigger than " +num2);
        }
        else if (num1 < num2){
            System.out.println(num2 + " is bigger than " + num1);
        }
        else {
            System.out.println("they are equal");
        }



    }
}
