package conversorunidades;

abstract public class ConversorMetros {
    protected int metros;

    public ConversorMetros(int metros) {
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