package gt.com.curso.ventacomputadoras;

import gt.com.curso.ventacomputadoras.model.Computadora;
import gt.com.curso.ventacomputadoras.model.Monitor;
import gt.com.curso.ventacomputadoras.model.Raton;
import gt.com.curso.ventacomputadoras.model.Teclado;
import gt.com.curso.ventacomputadoras.service.Orden;

public class Main {
    public static void main(String[] args) {
        // Computadora HP
        Teclado tecladoHP = new Teclado("USB", "HP");
        Raton ratonHP = new Raton("USB", "HP");
        Monitor monitorHP = new Monitor("HP", 30.0);
        Computadora computadoraHP = new Computadora("HP", tecladoHP, ratonHP, monitorHP);

        // Computadora MAC
        Teclado tecladoMAC = new Teclado("USB", "MAC");
        Raton ratonMAC = new Raton("USB", "MAC");
        Monitor monitorMAC = new Monitor("MAC", 30.0);
        Computadora computadoraMAC = new Computadora("MAC", tecladoMAC, ratonMAC, monitorMAC);

        // Computadora DELL
        Teclado tecladoDELL = new Teclado("Bluethooth", "DELL");
        Raton ratonDELL = new Raton("Bluethooth", "DELL");
        Monitor monitorDELL = new Monitor("Bluethooth", 27.0);
        Computadora computadoraDELL = new Computadora("DELL", tecladoDELL, ratonDELL, monitorDELL);

        // Creamos una orden
        Orden ordenUno = new Orden();
        ordenUno.agregarComputadora(computadoraHP);
        ordenUno.mostrarOrden();

        System.out.println();

        Orden ordenDos = new Orden();
        ordenDos.agregarComputadora(computadoraHP);
        ordenDos.agregarComputadora(computadoraMAC);
        ordenDos.mostrarOrden();

        System.out.println();

        Orden ordenTres = new Orden();
        ordenTres.agregarComputadora(computadoraHP);
        ordenTres.agregarComputadora(computadoraMAC);
        ordenTres.agregarComputadora(computadoraDELL);
        ordenTres.mostrarOrden();
    }
}
