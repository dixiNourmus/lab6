import java.util.Scanner;

public class months {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = 0;
        boolean done = false;
        String trash = "";

        do{
            System.out.println("eneter your birth month");
            if (scanner.hasNextInt()){
                month = scanner.nextInt();
                scanner.nextLine();
                if (month >= 1 && month <= 12){
                    done = true;
                }else{
                    System.out.println("out of range");
                }
            }else{
                trash = scanner.nextLine();
                System.out.println("thats not a valid month");
            }

        }while (!done);
        System.out.println("your birthmonth is "+month);



    }
}
