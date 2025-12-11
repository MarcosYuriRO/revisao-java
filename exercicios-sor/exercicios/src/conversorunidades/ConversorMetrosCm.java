package conversorunidades;

public class ConversorMetrosCm extends ConversorMetros{

    public ConversorMetrosCm(int metros) {
        super(metros);
    }


    void converterMetros() {
        int centimetros = (metros * 10) * 10;
        System.out.printf("A conversão de %d metros para centímetros é de: %d", metros, centimetros);
    }

}
