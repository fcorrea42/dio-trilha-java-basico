public class Operadores {
    public static void main(String[] args) {
        System.out.println("----Operadores de Atribuição e Aritméticos----");
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

        System.out.println("----Operadores Unários----");
        int numero = 5;
        System.out.println(-numero);

        numero = -numero;
        System.out.println(numero);

        numero = -numero;
        System.out.println(numero);

        System.out.println("----Operadores Unários de Incremento e Decremento----");
        numero = numero + 2;
        System.out.println(numero);

        numero++;
        //numero = numero + 1;
        System.out.println(numero);

        numero--;
        //numero = numero - 1;
        System.out.println(numero);

        System.out.println("----Operadores Unários Lógicos----");
        boolean variavel = true;

        System.out.println(!variavel);

        System.out.println(variavel);

        variavel = !variavel;
        System.out.println(variavel);

        System.out.println("----Operador Ternário----");
        int a,b;
        a = 6;
        b = 6;

        String resultado = "";
        
        resultado = a == b ? "verdadeiro" : "falso";
        /*
        if (a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        */
        
        System.out.println(resultado);

        System.out.println("----Operadores Relacionais----");
        String nomeUm = "JAVA";
        String nomeDois = new String("JAVA");
        
        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois));

        int numeroUm = 1;
        int numeroDois = 1;

        boolean simNao = numeroUm == numeroDois;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numeroUm != numeroDois;
        System.out.println("numeroUm é diferente de numeroDois? " + simNao);

        simNao = numeroUm > numeroDois;
        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        simNao = numeroUm < numeroDois;
        System.out.println("numeroUm é menor que numeroDois? " + simNao);

        if (numeroUm < numeroDois)
            System.out.println("A nossa condição de teste é verdadeira");
        else
            System.out.println("A nossa condição de teste é falsa");
        
        System.out.println("----Operadores Lógicos----");
        boolean condicaoUm = true;
        boolean condicaoDois = true;

        if (condicaoUm && condicaoDois) {
            System.out.println("As duas condições são verdadeiras.");
        }

        if (condicaoUm || condicaoDois) {
            System.out.println("Uma das duas condições é verdadeira.");
        }        

        System.out.println("FIM");
    }
}
