package condicionais;
public class ResultadoEscolarTernario {
    public static void main(String[] args) {
        int nota = 4;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        nota = 6;
		resultado = nota >=7 ? "Aprovado" : nota >= 5 ? "Prova de Recuperação" : "Reprovado";
		System.out.println(resultado);
    }
}
