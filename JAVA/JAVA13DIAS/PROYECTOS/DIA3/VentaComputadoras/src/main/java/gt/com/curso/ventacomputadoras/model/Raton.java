package gt.com.curso.ventacomputadoras.model;

public class Raton extends DispositivoEntrada {
    private final Integer ratonId;
    private static Integer contadorRaton = 0;

    public Raton(String tipoDeEntrada, String marca) {
        super(tipoDeEntrada, marca);
        ratonId = ++Raton.contadorRaton;
    }

    @Override
    public String toString() {
        return "Raton{" +
                "ratonId=" + ratonId +
                '}' + super.toString();
    }
}
