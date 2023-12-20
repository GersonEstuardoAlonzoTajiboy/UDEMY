package gt.com.curso.ventacomputadoras.service;

import gt.com.curso.ventacomputadoras.model.Computadora;

import java.util.ArrayList;
import java.util.List;

public class Orden {
    private final Integer ordenId;
    private final List<Computadora> computadoraList;
    private static Integer contadorOrden = 0;

    public Orden() {
        computadoraList = new ArrayList<>();
        ordenId = ++Orden.contadorOrden;
    }

    public void agregarComputadora(Computadora computadora) {
        computadoraList.add(computadora);
    }

    public void mostrarOrden() {
        System.out.println("Orden: #" + ordenId);
        System.out.println("Total computadoras: " + computadoraList.size());
        computadoraList.forEach(System.out::println);
    }
}
