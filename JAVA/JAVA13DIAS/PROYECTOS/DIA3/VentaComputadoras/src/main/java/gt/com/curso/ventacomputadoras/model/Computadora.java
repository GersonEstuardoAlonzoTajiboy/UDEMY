package gt.com.curso.ventacomputadoras.model;

public class Computadora {
    private final Integer computadoraId;
    private String nombre;
    private Teclado teclado;
    private Raton raton;
    private Monitor monitor;
    private static Integer contadorComputadora = 0;

    private Computadora() {
        computadoraId = ++Computadora.contadorComputadora;
    }

    public Computadora(String nombre, Teclado teclado, Raton raton, Monitor monitor) {
        this();
        this.nombre = nombre;
        this.teclado = teclado;
        this.raton = raton;
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "computadoraId=" + computadoraId +
                ", nombre='" + nombre + '\'' +
                ",\n teclado=" + teclado +
                ",\n raton=" + raton +
                ",\n monitor=" + monitor +
                '}';
    }
}
