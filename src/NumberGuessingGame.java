import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        int secretNumber = (int) (Math.random() * 100);

        System.out.println("----------------------------------------------");

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number I'm thinking of between 0 and 99.");
        System.out.println("Good luck!");

        System.out.println("----------------------------------------------");
        Scanner scanner = new Scanner(System.in);

        int userNumber;
        do{
            System.out.print("Enter a number between 0 and 99:");

            userNumber=scanner.nextInt();
            if(userNumber<secretNumber){
                System.out.println(" The number is higher.");
            }else if(userNumber>secretNumber){
                System.out.println(" The number is lower.");
            }else{
                System.out.println("Congratulations! You've guessed the secretNumber.");
            }
        }while(userNumber!=secretNumber);
        scanner.close();
    }
}
