package conversorcelsius;
public class ConversorCelsiusKelvin extends ConversorCelsius{

    public ConversorCelsiusKelvin(int temperaturaEmCelsius) {
        super(temperaturaEmCelsius);
    }

    private double temperaturaEmKelvin;

    public void converterCelsius() {
        temperaturaEmKelvin = temperaturaEmCelsius + 273.15;

        System.out.printf("A temperatura %d C° convertida para Kelvin: %.2f ", temperaturaEmCelsius, temperaturaEmKelvin);
    }

}
