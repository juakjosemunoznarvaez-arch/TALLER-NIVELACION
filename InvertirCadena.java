import java.util.Scanner;

public class InvertirCadena {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite una palabra:");
        String palabra = entrada.nextLine();

        String resultado = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            resultado = resultado + palabra.charAt(i);
        }

        System.out.println("La palabra invertida es: " + resultado);

        entrada.close();
    }
}