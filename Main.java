import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
        System.out.println("Choose one of the following:");
        System.out.println("1: Soda, 2: Chips, 3: Candy, 4: Water");
    byte choice = myObj.nextByte();

    switch (choice) {
        case 1:
            System.out.println("Soda - Price: $1.50");
            break;

        case 2:
            System.out.println("Chips - Price: $1.25");
            break;

        case 3:
            System.out.println("Candy - Price: $0.75");
            break;

        case 4:
            System.out.println("Water - Price: $1.00");

        default:
            System.out.println("Invalid input.");
    }
        }
    }
