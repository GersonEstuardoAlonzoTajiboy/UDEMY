package gt.com.curso.ventacomputadoras.model;

public class Monitor {
    private final Integer monitorId;
    private String marca;
    private Double tamanio;
    private static Integer contadorMonitor = 0;

    private Monitor() {
        monitorId = ++Monitor.contadorMonitor;
    }

    public Monitor(String marca, Double tamanio) {
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "monitorId=" + monitorId +
                ", marca='" + marca + '\'' +
                ", tamanio=" + tamanio +
                '}';
    }
}
