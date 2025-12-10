
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo(a) ao Gerenciador de Orçamento!");
        System.out.println("Por favor, insira seu orçamento mensal:");

        double orcamentoMensal = scanner.nextDouble();
        scanner.nextLine();
        double despesasTotais = 0.0;
        String mensagem = "";
        double orcamentoFinal = orcamentoMensal;

        while (orcamentoMensal > 0 && !mensagem.equalsIgnoreCase("sair")) {
            System.out.println("Escreva sua despesa, ou digite 'sair' para encerrar.");
            mensagem = scanner.nextLine();

            if (!mensagem.equalsIgnoreCase("sair")) {
                despesasTotais += Double.parseDouble(mensagem);
                orcamentoFinal = orcamentoMensal - despesasTotais;
                System.out.println("Despesa adicionada");
                System.out.println("Despesas Totais: " + despesasTotais);
                System.out.println("Orçamento Restante: " + orcamentoFinal);

                double zonaDeRisco = orcamentoMensal * 0.9;
                if (despesasTotais > zonaDeRisco && despesasTotais < orcamentoMensal) {
                    System.out.println("Atenção: Você está na zona de risco (90%) do seu orçamento!");
                } else if (despesasTotais >= orcamentoMensal) {
                    System.out.println("Orçamento esgotado!");
                    System.out.println("Orçamento Final: " + orcamentoFinal);
                    mensagem = "sair";
                }
            } else {
                System.out.println("Encerrando o programa.");
                System.out.println("Despesas Totais do Mês: " + despesasTotais);
                System.out.println("Orçamento Final do Mês: " + orcamentoFinal);
        
            }
        }
        scanner.close();
    }
}
