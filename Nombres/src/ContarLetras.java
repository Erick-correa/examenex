import java.util.Scanner;

public class ContarLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra u oración:");
        String entrada = scanner.nextLine();

        int contadorLetras = contarLetras(entrada);
        int contadorVocales = contarVocales(entrada);
        int contadorPalabras = contarPalabras(entrada);

        System.out.println("La cantidad de letras en la entrada es: " + contadorLetras);
        System.out.println("La cantidad de vocales en la entrada es: " + contadorVocales);
        System.out.println("La cantidad de palabras en la entrada es: " + contadorPalabras);
    }

    // Método para contar letras
    public static int contarLetras(String texto) {
        int contador = 0;
        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                contador++;
            }
        }
        return contador;
    }

    // Método para contar vocales
    public static int contarVocales(String texto) {
        int contador = 0;
        for (char c : texto.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }

    // Método para contar palabras
    public static int contarPalabras(String texto) {
        String[] palabras = texto.trim().split("\\s+");
        return palabras.length;
    }
}
