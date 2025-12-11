package validadordedados;

public abstract class ValidadorDeNumeros {

    protected int numero;

    public ValidadorDeNumeros(int numero) {
        this.numero = numero;
    }

    abstract void validarNumeros();
}

