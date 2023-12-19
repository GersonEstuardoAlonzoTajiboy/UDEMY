package gt.com.curso.calculadora.model;

import java.util.Scanner;

public class Calculadora {
    public static void mostrarMenu() {
        System.out.println("***** Aplicacion Calculadora *****\n");
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5. Salir
                """);
        System.out.print("¿Operacion a realizar? ");
    }

    public static void ejecutarOperacion(int operacion, Scanner scanner) {
        System.out.print("\nProporciona valor operando 1: ");
        var operandoUno = Double.parseDouble(scanner.nextLine());
        System.out.print("\nProporciona valor operando 2: ");
        var operandoDos = Double.parseDouble(scanner.nextLine());
        System.out.println();
        double resultado;
        switch (operacion) {
            case 1 -> {
                resultado = operandoUno + operandoDos;
                System.out.println("Suma: " + operandoUno + " + " + operandoDos + " = " + resultado + "\n");
            }
            case 2 -> {
                resultado = operandoUno - operandoDos;
                System.out.println("Resta: " + operandoUno + " - " + operandoDos + " = " + resultado + "\n");
            }
            case 3 -> {
                resultado = operandoUno * operandoDos;
                System.out.println("Multiplicacion: " + operandoUno + " * " + operandoDos + " = " + resultado + "\n");
            }
            case 4 -> {
                resultado = operandoUno / operandoDos;
                System.out.println("Division: " + operandoUno + " / " + operandoDos + " = " + resultado + "\n");
            }
            default -> System.out.println("¡Opcion incorrecta! " + operacion);
        }
    }
}
