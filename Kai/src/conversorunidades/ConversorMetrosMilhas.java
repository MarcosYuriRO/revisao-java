package conversorunidades;

public class ConversorMetrosMilhas extends ConversorMetros{

    public ConversorMetrosMilhas(int metros) {
        super(metros);
    }

    final double CONVERTER_PARA_MILHAS = 0.00062137119;

    @Override
    void converterMetros() {
        double metrosConvertidos = (double) metros * CONVERTER_PARA_MILHAS;
        System.out.printf("A conversão de %d metros para milhas é de: %f", metros, metrosConvertidos);
    }

}
