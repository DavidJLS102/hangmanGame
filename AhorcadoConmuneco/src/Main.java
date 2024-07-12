import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] palabras =  {"HOLA", "PAUL", "FUTBOL", "JUEGO", "AHORCADO"};
        Random random = new Random();
        String palabra = palabras[random.nextInt(palabras.length)];
        char[] palabraMostrada = new char[palabra.length()];

        for (int i = 0; i < palabraMostrada.length; i++) {
            palabraMostrada[i] = '_';
        }

        int intentos = 6;
        boolean haGanado = false;

        while (intentos > 0 && !haGanado) {
            PrintStream var10000 = System.out;
            String var10001 = new String(palabraMostrada);
            var10000.println("Palabra: " + var10001);
            System.out.println("Intentos restantes: " + intentos);
            imprimirMuneco(intentos);
            System.out.print("Introduce una letra: ");
            char letra = scanner.nextLine().toUpperCase().charAt(0);
            boolean letraAcertada = false;

            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    palabraMostrada[i] = letra;
                    letraAcertada = true;
                }
            }

            if (!letraAcertada) {
                intentos--;
            }

            haGanado = true;

            for (int i = 0; i < palabraMostrada.length; i++) {
                if (palabraMostrada[i] == '_') {
                    haGanado = false;
                    break;
                }
            }
        }

        if (haGanado) {
            System.out.println("Has adivinado la palabra: " + palabra);
        } else {
            System.out.println("Te has quedado sin intentos. La palabra era: " + palabra);
            imprimirMuneco(intentos);
        }

        scanner.close();
    }

    public static void imprimirMuneco(int intentos) {
        switch (intentos) {
            case 6:
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                break;
            case 5:
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("______");
                break;
            case 4:
                System.out.println("  |   ");
                System.out.println("  |   ");
                System.out.println("  |   ");
                System.out.println("  |   ");
                System.out.println("  |   ");
                System.out.println("______");
                break;
            case 3:
                System.out.println("  _______");
                System.out.println("  |   ");
                System.out.println("  |   ");
                System.out.println("  |   ");
                System.out.println("  |   ");
                System.out.println("  |   ");
                System.out.println("______");
                break;
            case 2:
                System.out.println("  _______");
                System.out.println("  |     |");
                System.out.println("  |     O");
                System.out.println("  |   ");
                System.out.println("  |   ");
                System.out.println("  |   ");
                System.out.println("______");
                break;
            case 1:
                System.out.println("  _______");
                System.out.println("  |     |");
                System.out.println("  |     O");
                System.out.println("  |     |");
                System.out.println("  |   ");
                System.out.println("  |   ");
                System.out.println("______");
                break;
            case 0:
                System.out.println("  _______");
                System.out.println("  |     |");
                System.out.println("  |     O");
                System.out.println("  |    /|\\");
                System.out.println("  |    / \\");
                System.out.println("  |   ");
                System.out.println("______");
                break;
        }
    }
}

