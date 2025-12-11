package validadordedados;
public class ValidadorParImpar extends ValidadorDeNumeros{

    public ValidadorParImpar(int numero) {
        super(numero);
    }

    @Override
    void validarNumeros() {
        switch (numero % 2) {
            case 0 -> System.out.printf("O número %d é PAR.", numero);
            case 1 -> System.out.printf("O número %d é ÍMPAR.", numero);
            default -> System.out.println("Entrada inválida. Tente novamente.");
        }
    }
}