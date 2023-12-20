package gt.com.curso.ventacomputadoras.model;

public class DispositivoEntrada {
    private final String dispositivoEntrada;
    private final String marca;

    public DispositivoEntrada(String dispositivoEntrada, String marca) {
        this.dispositivoEntrada = dispositivoEntrada;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivoEntrada{" +
                "dispositivoEntrada='" + dispositivoEntrada + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
