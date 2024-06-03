public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //tipos priitivos
        //classe string
        
        String meuNome = "Philipe Oliveira";
        double salarioMinimo =2500;

        short numeroCurto =1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        // acima foi feito um exemplo de cast
        // abaixo aprendemos a diferença de variável e constante

        int numero = 5;

        numero = 10;

        System.out.print(numero);
        final double VALOR_DE_PI = 3.14;

        VALOR_DE_PI = 10.75;
        // Acima vemos um exemplo que precisamos adicionar o termo "final" antes do tipo para que se torne constante


    }
}
