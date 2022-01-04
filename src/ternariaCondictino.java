public class ternariaCondictino {
    public static void main(String[] args){

        //if-else condicitions
        double preco = 34.5;
        double desconto;
        if(preco < 20.0){
            desconto = preco * 0.1;
        }
        else{
            desconto = preco * 0.05;
        }
        System.out.println(desconto);

        //ternaria condictions
        double preco1 = 34.5;
        double desconto1 = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto1);

    }
}
