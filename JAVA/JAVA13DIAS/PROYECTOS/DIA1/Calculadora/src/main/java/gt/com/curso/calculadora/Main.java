package gt.com.curso.calculadora;

import gt.com.curso.calculadora.model.Calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Calculadora.mostrarMenu();
            try {
                var operacion = Integer.parseInt(scanner.nextLine());
                if (operacion >= 1 && operacion <= 4) {
                    Calculadora.ejecutarOperacion(operacion, scanner);
                } else if (operacion == 5) {
                    System.out.println("\n¡Hasta pronto! ...");
                    break;
                } else {
                    System.out.println("\n¡Opcion incorrecta! " + operacion + "\n");
                }
            } catch (Exception exception) {
                System.out.println("\nSe produjo el siguiente error: \n" + exception.getMessage() + "\n");
            }
        }
    }
}
