import java.util.Scanner;

public class prime {
    static Scanner user_input = new Scanner(System.in);

    public static void main(String[] args) {
        prln("Enter a any number");

        int number = user_input.nextInt();
        int count = 0;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
                break;

            }

        }
        if (count == 0) {
            prln("prime number");
        } else {
            prln("Not a prime number");
        }

    }

    static void prln(Object anyObject) {
        System.out.println(anyObject);
    }
}
