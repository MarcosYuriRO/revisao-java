package validadordedados;

import java.time.Year;

public class ValidadorAnoBissexto extends ValidadorDeNumeros{

    public ValidadorAnoBissexto(int numero) {
        super(numero);
    }

    @Override
    void validarNumeros() {
        if (Year.isLeap(numero)) {
            System.out.printf("O ano %d é ano BISSEXTO.", numero);
        } else if (!Year.isLeap(numero)) {
            System.out.printf("O ano %d NÃO é bissexto.", numero);
        } else {
            System.out.println("Entrada inválida. Tente novamente.");
        }
    }

}
