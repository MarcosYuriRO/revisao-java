package conversordeunidades;


abstract public class Conversor {
    protected int metros;

    public Conversor(int metros) {
        this.metros = metros;
    }


    public int getMetros() {
        return metros;
    }
    public void setMetros(int metros) {
        this.metros = metros;
    }

    abstract void converterMetros();
    
}
