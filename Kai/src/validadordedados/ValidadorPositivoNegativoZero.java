package validadordedados;

public class ValidadorPositivoNegativoZero extends ValidadorDeNumeros{

    public ValidadorPositivoNegativoZero(int numero) {
        super(numero);
    }

    @Override
    void validarNumeros() {
        if (numero > 0) {
            System.out.printf("O número %d é POSITIVO.", numero);
        } else if (numero < 0) {
            System.out.printf("O número %d é NEGATIVO.", numero);
        } else if (numero == 0) {
            System.out.printf("O número %d é IGUAL A ZERO.", numero);
        } else {
            System.out.println("Entrada inválida. Tente novamente.");
        }
    }

}
