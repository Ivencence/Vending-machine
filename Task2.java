import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Select a number between 1 and 10");
        byte num = myObj.nextByte();

        if(num == 5){
        System.out.println("You guessed the number! Congratulations!");

        }

        else if(num<5){
            System.out.println("You didn't guess the number. Try a bigger number.");

        }

        else{
            System.out.println("You didn't guess the number. Try a smaller number.");
        }

        System.out.println("Do a second attempt. Two attempts left");
        num = myObj.nextByte();
        if(num == 5){
        System.out.println("You guessed the number! Congratulations!");

        }

        else if(num<5){
            System.out.println("You didn't guess the number. Try a bigger number.");

        }

        else{
            System.out.println("You didn't gues the number. Try a smaller number.");
        }

        System.out.println("Do a third attempt. One attempt left.");
        num = myObj.nextByte();
        if(num == 5){
        System.out.println("You guessed the number! Congratulations!");

        }

        else if(num<5){
            System.out.println("You didn't guess the number. Try a bigger number.");

        }

        else{
            System.out.println("You didn't guess the number. Try a smaller number.");
        }
        System.out.println("No attempts left.");
    }
}
