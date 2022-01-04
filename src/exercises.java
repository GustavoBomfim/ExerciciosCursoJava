import java.util.Scanner;

public class exercises {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //exercise1
        System.out.println("Digite dois numeros inteiros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("A soma é: " + (a+b));

        //exercise2
        System.out.println("Digite o raio do circulo: ");
        double raio = sc.nextDouble();
        double pi = 3.14159;
        double areaCirculo = Math.pow(raio,2) * pi;
        System.out.println("A=" + areaCirculo);

        //exercise3
        System.out.println("Digite quatro valores inteiros: ");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        int d1 = sc.nextInt();
        int diferenca = (a1*b1) - (c1 * d1);
        System.out.println("Diferenca = " + diferenca);

        //exercise4
        System.out.println("Digite o numero do funcionario");
        int numeroFuncionario = sc.nextInt();
        System.out.println("Horas trabalhadas e o salario por hora");
        int horaTrabalhada = sc.nextInt();
        double salarioHora = sc.nextDouble();
        double salary = horaTrabalhada * salarioHora;
        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.println("SALARY =" + salary);

        //exercise5
        System.out.println("Digite o codigo de uma peça");
        int codigoPeca = sc.nextInt();
        System.out.println("A quantidade de peças: ");
        int quantidade = sc.nextInt();
        System.out.println("O preço: ");
        double preco = sc.nextDouble();

        //peça2
        System.out.println("Digite o codigo de uma outra peça");
        int codigoPeca2 = sc.nextInt();
        System.out.println("A quantidade de peças: ");
        int quantidade2 = sc.nextInt();
        System.out.println("O preço: ");
        double preco2 = sc.nextDouble();

        double valor = quantidade * preco +  quantidade2 * preco2;
        System.out.println("Valor a pagar: " + valor);
    }
}
