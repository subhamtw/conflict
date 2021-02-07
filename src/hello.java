import java.util.Random;
import java.awt.*;

public class hello {
    public static String determineGuess(int userAnswer, int computerNumber, int count){
        if (userAnswer <=0 || userAnswer >100) {
            return "Your guess is invalid";
        }
        else if (userAnswer == computerNumber ){
            return "Correct!\nTotal Guesses: " + count;
        }
        else if (userAnswer > computerNumber) {
            return "Your guess is too high, try again.\nTry Number: " + count;
        }
        else if (userAnswer < computerNumber) {
            return "Your guess is too low, try again.\nTry Number: " + count;
        }
        else {
            return "Your guess is incorrect\nTry Number: " + count;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        for (int i=0;i<10 ;i++){
            System.out.println("this is good ");
            if(i%2==0)
                System.out.println("Hello");
            else
                System.out.println("NOOOOOOO");
        }
        System.out.println("This is shubham");
        Point point = new Point();
        point.x =10;
        point.y=20;

        System.out.println(point.toString());
    }
}
