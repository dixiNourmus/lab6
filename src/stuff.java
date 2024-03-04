import java.util.Scanner;

public class stuff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int balls = 0;
        double penis = 0;
        String grr = "";
        boolean done = false;

        do{
            System.out.println("enter something");
            if (in.hasNextInt()){
                System.out.println("you gave me an int");
                done = true;

            }else if (in.hasNextDouble()){
                System.out.println("you gave me a double");
                done = true;
            }else if (in.hasNextLine()){
                System.out.println("you gave me a string");
                done = true;
            }








        }while (!done);




    }


}
