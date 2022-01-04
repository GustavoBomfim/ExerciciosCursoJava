import java.util.Locale;

public class functions {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        double x = 3.0, y = 4.0, z = -5.0;
        double a, b, c;

        a = Math.sqrt(x);
        b = Math.sqrt(y);
        c = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de " + x + " é : " + a);
        System.out.println("Raiz quadrada de " + y + "é : " + b);
        System.out.println("Raiz quadrada de 25.0 é: " + c);

        a = Math.pow(x, y);
        b = Math.pow(x, 2.0);
        c = Math.pow(2.0, 5.0);

        System.out.println(x + " elevado a " + y + " é igual a: " + a);
        System.out.println(x + " elevado a 2 é igual a: " + b);
        System.out.println("2 elevado a 5 é igual a: " + c);

        a = Math.abs(z);
        System.out.println("O valor absoluto de: " + z + " é: " + a);

    }

}
