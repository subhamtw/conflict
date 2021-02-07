import java.util.Random;

public class hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Random random = new Random();
        int number = random.nextInt(3);
        switch(number){
            case 1:
                System.out.println("Apple");
                break;
            case 2:
                System.out.println("Mango");
                break;
            default:
                System.out.println("Better Luck Next Time");
        }

        System.out.println("This is shubham");
    }
}
