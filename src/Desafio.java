import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        String nome = "Elaine Maria da Silva";
        String tipoConta = "Corrente";
        double saldo = 2700.00;
        int operacao = 0;
        double deposito = 0;
        double tranferencia = 0;
        String opcoes = """
                            Operações                
                           1- Consultar saldos
                           2- Deposito
                           3- Transferência
                           4- Sair
                  
                           Digite a opção desejada:
                         """;

        System.out.println("***************");
        System.out.println("Dados do cliente");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("***************");


        while (operacao != 4){
            System.out.printf(opcoes);
            operacao = leitura.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Seu saldo é de " + saldo);


                    break;
                case 2:
                    System.out.println("Digite o valor que será depositado: ");
                    deposito = leitura.nextDouble();
                    saldo = saldo + deposito;
                    System.out.println("Seu saldo atual é de " + saldo);

                    break;


                case 3:
                    System.out.println("Digite o valor que será transferido");
                    tranferencia = leitura.nextDouble();
                    if (tranferencia > saldo) {
                        System.out.println("Saldo insuficiente para esta transferêcia, por favor verifique o saldo diponível.");
                    } else {
                        saldo = saldo - tranferencia;
                        System.out.println("Seu saldo atual é de " + saldo);
                    }

                   
                    break;
                case 4:
                    System.out.println("Obrigada por usar nosso serviços!");
                    break;
            }

        }
        leitura.close();
    }
}









