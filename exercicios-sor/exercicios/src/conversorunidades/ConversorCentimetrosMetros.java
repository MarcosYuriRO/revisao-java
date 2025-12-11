package conversorunidades;

public class ConversorCentimetrosMetros extends ConversorMetros{

    public ConversorCentimetrosMetros(int metros) {
        super(metros);
    }

    int centimetros;

    @Override
    void converterMetros() {
        metros = (centimetros / 10) / 10;
        System.out.printf("A conversão de %d centímetros para metros é de: %d",  centimetros, metros);
    }

}
