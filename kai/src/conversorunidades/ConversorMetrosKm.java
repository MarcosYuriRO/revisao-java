package conversorunidades;

public class ConversorMetrosKm extends ConversorMetros{

    public ConversorMetrosKm(int metros) {
        super(metros);
    }

    int quilometros;

    @Override
    void converterMetros() {
        quilometros = (metros / 10) / 10 / 10;
        System.out.printf("A conversão de %d metros para quilometros é de: %d", metros, quilometros);
    }

}
