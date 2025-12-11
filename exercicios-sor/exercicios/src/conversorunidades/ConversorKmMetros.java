package conversorunidades;

public class ConversorKmMetros extends ConversorMetros{

    private int quilometros;


    public ConversorKmMetros(int quilometros) {
        super(quilometros);
        this.quilometros = quilometros;
    }


    @Override
    void converterMetros() {
        metros = (quilometros * 10) * 10 * 10;
        
        System.out.printf("A conversão de %d quilometros para metros é de: %d",  quilometros, metros);
    }

}
