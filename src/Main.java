import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int theNumber = (int) (Math.random() * 1000 + 1);
        Scanner input = new Scanner(System.in);
        int guess = 0;
        while(guess != theNumber) {
            System.out.println("Guess a number between 1 and 100");
            guess = input.nextInt();
            System.out.println("You entered " + guess + ".");
            if(guess < theNumber)
            {
                System.out.println(guess + " is too low. Try again");
            }
            else if(guess > theNumber)
            {
                System.out.println(guess + " is too high. Try again");
            }
            else
            {
                System.out.println(guess + " is correct. You win!");
            }
        }





















        System.out.println(theNumber);
    }
}