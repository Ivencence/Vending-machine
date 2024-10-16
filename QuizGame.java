import java.util.Scanner;
public class QuizGame {
    public static <booleen> void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Choose one of the subjects: 1. Science 2. History, 3. Sports");
        byte subject = myObj.nextByte();

switch(subject){
    case 1:
        System.out.println("What is the value of pi? Use three significant digits.");
        double guess1 = myObj.nextDouble();
        if(guess1 == 3.14){
            System.out.println("You are correct! You earned one point.");
        }
        else{
            System.out.println("You are incorrect. The correct answer is 3.14.");
        }
        break;

    case 2:
        System.out.println("What year did the Great Bourgeois Revolution begin?");
        int guess2 = myObj.nextInt();
        if(guess2 == 1789){
            System.out.println("You are correct! You earned one point!");
        }
        else{
            System.out.println("You are incorrect. The correct answer is 1789.");
        }
        break;

    case 3:
        System.out.println("Rocky Marciano is a boxer. True or false?");
        boolean guess3 = myObj.nextBoolean();
        if (guess3 == true){
            System.out.println("You are correct! You earned a point!");
        }
         else{
            System.out.println("You are incorrect. The correct answer is 1789.");
        }
         break;

    default:
        System.out.println("Invalid category choice.");

}
    }
}
