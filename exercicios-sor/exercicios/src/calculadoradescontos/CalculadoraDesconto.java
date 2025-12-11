package calculadoradescontos;

public class CalculadoraDesconto {
    public int preco;


    public CalculadoraDesconto(int preco) {
        this.preco = preco;
    }

    public int getPreco() {
        return preco;
    }
    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void calcularDesconto() {
        double desconto;
        if (preco >= 100) {
            desconto = preco - (preco * 0.10);
            System.out.println("Valor recebeu desconto de 10%. Valor atual: " + desconto);
        } else if (preco >= 250) {
            desconto = preco - (preco * 0.20);
            System.out.println("Valor recebeu desconto de 20%. Valor atual: " + desconto);
        } else if (preco >= 500) {
            desconto = preco - (preco * 0.30);
            System.out.println("Valor recebeu desconto de 30%. Valor atual: " + desconto);
        } else {
            System.out.println("Não foi possível aplicar o desconto.");
        }

    }
}
