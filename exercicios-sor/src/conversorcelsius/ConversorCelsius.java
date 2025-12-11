package conversorcelsius;
public abstract class ConversorCelsius {
    protected int temperaturaEmCelsius;

    public ConversorCelsius(int temperaturaEmCelsius) {
        this.temperaturaEmCelsius = temperaturaEmCelsius;
    }

    public int getTemperaturaEmCelsius() {
        return temperaturaEmCelsius;
    }

    public void setTemperaturaEmCelsius(int temperaturaEmCelsius) {
        this.temperaturaEmCelsius = temperaturaEmCelsius;
    }

    public abstract void converterCelsius();
}
