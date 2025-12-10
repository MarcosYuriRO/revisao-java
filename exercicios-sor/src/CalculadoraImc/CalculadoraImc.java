package CalculadoraImc;

public class CalculadoraImc {
    private int peso;
    private double altura;

    
    public CalculadoraImc(int peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void calcularImc() {
        double imc = peso / (altura * altura);
        System.out.println("O IMC é: " + imc);

        if (imc < 18.5) {
            System.out.println("De acordo com o seu IMC, você está: Abaixo do peso.");
        } else if (imc > 18.5 && imc < 24.9) {
            System.out.println("De acordo com o seu IMC, você está: Peso normal.");
        } else if (imc > 25 && imc < 29.9) {
            System.out.println("De acordo com o seu IMC, você está: Sobrepeso.");
        } else if (imc > 20 && imc < 34.9) {
            System.out.println("De acordo com o seu IMC, você está: Obesidade grau I.");
        } else if (imc > 35 && imc< 39.9) {
            System.out.println("De acordo com o seu IMC, você está: Obesidade grau II.");
        } else if (imc > 40) {
            System.out.println("De acordo com o seu IMC, você está: Obesidade grau III.");
        } else {
            System.out.println("Ocorreu um erro ao tentar exibir um resultado.");
        }
    }
}
