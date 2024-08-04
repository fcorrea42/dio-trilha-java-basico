package excecoes;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        // Unchecked Exception
        // Number valor = Double.valueOf("a1.75");

        // Checked Exception
        Number valor;

        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }        
    }
}
