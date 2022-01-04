import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;

public class Input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.println("Enter your name ");
        String name = sc.next();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter your height: ");
        double height = sc.nextDouble();

        System.out.println("Type a vowel: ");
        char vowel = sc.next().charAt(0);




        System.out.println("Hello, " + name);


       sc.close();
    }
}
