public class Operadores {
    // Nesse momento vimos a concatenação de tipos inteiros e texto.
    public static void main(String[] args) {
        String nomeCompleto = "LIGUAGEM" + "JAVA";
        System.out.println();

        String concatenacao = "?";
        
        concatenacao = 1+1+1+"1";
        
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);
    }
}
