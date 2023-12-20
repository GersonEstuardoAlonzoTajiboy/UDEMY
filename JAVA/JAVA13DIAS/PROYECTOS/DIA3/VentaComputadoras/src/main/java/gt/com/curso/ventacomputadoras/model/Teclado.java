package gt.com.curso.ventacomputadoras.model;

public class Teclado extends DispositivoEntrada {
    private final Integer tecladoId;
    private static Integer contadorTeclado = 0;

    public Teclado(String dispositivoDeEntrada, String marca) {
        super(dispositivoDeEntrada, marca);
        tecladoId = ++Teclado.contadorTeclado;
    }

    @Override
    public String toString() {
        return "Teclado{" +
                "tecladoId=" + tecladoId +
                '}' + super.toString();
    }
}
