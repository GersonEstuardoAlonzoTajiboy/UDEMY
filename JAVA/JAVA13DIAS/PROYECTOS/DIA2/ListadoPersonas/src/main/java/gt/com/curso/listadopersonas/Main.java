package gt.com.curso.listadopersonas;

import gt.com.curso.listadopersonas.model.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Persona> personaList = new ArrayList<>();
        boolean salir = false;
        while (!salir) {
            Persona.mostrarMenuListadoPersonas();
            try {
                salir = Persona.ejecutarOperacion(scanner, personaList);
            } catch (Exception exception) {
                System.out.println("\n¡Opcion incorrecta! " + exception.getMessage() + "\n");
            }
        }
    }
}
