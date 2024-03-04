

import java.util.Scanner;

public class racialdiscrimination {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String party = "";
        String trash = "";
        boolean done = false;
        System.out.println("what is your party affiliation?");
        do {
            if (in.hasNextLine()) {
                party = in.nextLine();

                if (party.equalsIgnoreCase("D")){
                    System.out.println("you are democratic donkey");
                    done = true;
                }else if (party.equalsIgnoreCase("R")) {
                    System.out.println("you are republican elephant");
                    done = true;
                } else if (party.equalsIgnoreCase("I")){
                    System.out.println("you are independent");
                    done = true;
                }else {
                    System.out.println("thats not a valid party");

                }



            }else {
                trash = in.nextLine();
                System.out.println("thats not a valid party");

            }


        }while (!done);
    }


}
