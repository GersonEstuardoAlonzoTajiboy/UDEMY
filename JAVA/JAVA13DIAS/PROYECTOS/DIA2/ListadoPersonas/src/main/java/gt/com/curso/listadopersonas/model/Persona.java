package gt.com.curso.listadopersonas.model;

import lombok.*;

import java.util.List;
import java.util.Scanner;

@Getter
@Setter
@ToString
public class Persona {
    private Integer personaId;
    private String nombre;
    private String telefono;
    private String correoElectronico;
    private static Integer numeroPersonas = 0;

    public Persona() {
        this.personaId = ++Persona.numeroPersonas;
    }

    public Persona(String nombre, String telefono, String correoElectronico) {
        this();
        this.nombre = nombre;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public static void mostrarMenuListadoPersonas() {
        System.out.print("""
                ***** Listado Personas App *****
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("\nProporciona la operacion: ");
    }

    public static boolean ejecutarOperacion(Scanner scanner, List<Persona> personaList) {
        int operacion = Integer.parseInt(scanner.nextLine());
        boolean salir = false;
        switch (operacion) {
            case 1 -> {
                System.out.print("\nProporciona el nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Proporciona el telefono: ");
                String telefono = scanner.nextLine();
                System.out.print("Proporciona el correo electronico: ");
                String correoElectronico = scanner.nextLine();
                Persona persona = new Persona(nombre, telefono, correoElectronico);
                personaList.add(persona);
                System.out.println("\nLa lista tiene: " + personaList.size() + " elementos.\n");
            }
            case 2 -> {
                System.out.println("\nListado de Personas\n");
                personaList.forEach(System.out::println);
                System.out.println();
            }
            case 3 -> {
                System.out.println("\n¡Hasta pronto...!");
                salir = true;
            }
            default -> System.out.println("\n¡Opcion incorrecta...! " + operacion + "\n");
        }
        return salir;
    }
}
