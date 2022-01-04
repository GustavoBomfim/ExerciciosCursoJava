import java.util.Scanner;

public class CalculatorTriangle {
    public static void main(String[] args){
        Triangle x = new Triangle();
        Triangle y = new Triangle();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers to calculate the area of the triangle x");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter three numbers to calculate the area of the triangle y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) *(p - x.c));

        p = (y.a + y.b + y.c) / 2.0;
        double areaY= Math.sqrt(p * (p - y.a) * (p - y.b) *(p - y.c));
        System.out.println("Triangle y area= " + areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        }
        else {
            System.out.println("Larger area: Y");
        }
        sc.close();


    }
}
