package conversorcelsius;
public class ConversorCelsiusFahrenheit extends ConversorCelsius {

    public ConversorCelsiusFahrenheit(int temperaturaEmCelsius) {
        super(temperaturaEmCelsius);
    }

    private int temperaturaEmFahrenheit;

    public void converterCelsius() {
        temperaturaEmFahrenheit = (temperaturaEmCelsius * 9 / 5) + 32;

        System.out.printf("A temperatura %d C° convertida para Fahrenheit: %d\n", temperaturaEmCelsius, temperaturaEmFahrenheit);
    }

}
