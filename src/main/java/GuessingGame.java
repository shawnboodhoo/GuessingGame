import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = (int) (Math.random() * 10);

        System.out.println("guess a number");

        int nextInt = 0;

       while (i != nextInt) {
            nextInt = scanner.nextInt();
           if (nextInt > i) {
               System.out.println("lower");
           } else if (nextInt < i) {
               System.out.println("higher");
           } else {
               System.out.println("correct");
           }
       }




    }


}
