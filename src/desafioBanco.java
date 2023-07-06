import java.util.Scanner;

public class desafioBanco {
    public static void main(String [] args){
        String nome = "Isabella Cruz";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("****************************");
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("Tipo Conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("****************************");

     String menu = "** Digite sua opção **\n" +
              "1 - Consultar saldo\n" +
              "2 - Transferir valor\n" +
              "3 - Receber valor\n" +
              "4 - Sair";

        
        Scanner leitura = new Scanner(System.in);

        while(opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if(opcao == 1){
                System.out.println("O saldo atualizado é " + saldo);
            } else if(opcao == 2){
                System.out.println("Qual o valor que deseja transferir? ");
                double valor = leitura.nextDouble();

                if(valor > saldo){
                    System.out.println("Não há saldo para realizar transferência");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo " + saldo);
                }
            } else if(opcao == 3) {
                System.out.println("Valor recebido ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo " + saldo);
            } else if(opcao != 4){
                System.out.println("Opção inválida ");
            }
        }
    }
}
