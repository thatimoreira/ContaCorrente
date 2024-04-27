// Menu de opções
// Visualização de saldo
// Receber valor

import java.util.Scanner;;

/*public static void exibirMenu(String nome, String tpConta, double saldo)
{
    // TODO Auto-generated method stub
   
}*/

public class Main
{
    public static void main(String[] args)
    {
        String  nomeCliente;
        String  tipoConta;
        double  saldoCliente;
        String  menu;
        Scanner teclado;
        int     opcaoCliente;

        nomeCliente = "John Doe";
        tipoConta = "Conta Corrente";
        saldoCliente = 3700;
        menu = """
            Digite a opção desejada:
    
            1- Consultar saldo
            2- Depositar
            3- Saque
            4- Transferência
            5- Sair
                """;
        opcaoCliente = 0;
        System.out.println("\n===================== MEU BANCO =====================\n");
        System.out.printf("Cliente:.........%s\n", nomeCliente);
        System.out.printf("Tipo de conta:...%s\n", tipoConta);
        System.out.printf("Saldo:...........R$%.2f\n", saldoCliente);
        System.out.println("\n=====================================================\n");

        //exibirMenu(nomeCliente, tipoConta, saldoCliente);
        teclado = new Scanner(System.in);
        while (opcaoCliente != 5)
        {
            System.out.println(menu);
            opcaoCliente = teclado.nextInt();
            System.out.println("------------------------------------------------------\n");
            switch (opcaoCliente)
            {
                case 1:
                {
                    //exibirSaldo();
                    System.out.printf("Saldo atual:.....R$%.2f\n", saldoCliente);
                    System.out.println("\n------------------------------------------------------\n");
                    break;
                }
                case 2:
                {
                    // Lógica Depositar
                }
                case 3:
                {
                    double  valorSaque;
                    System.out.print("Informe o valor do saque: R$");
                    valorSaque = teclado.nextDouble();
                    if (valorSaque <= saldoCliente)
                    {
                        saldoCliente -= valorSaque;
                        System.out.printf("Saldo atual:..............R$%.2f\n", saldoCliente);
                        System.out.println("\nSaque efetuado com sucesso!\n");
                    }
                    else
                    {
                        System.out.printf("Saldo atual:..............R$%.2f\n", saldoCliente);
                        System.out.println("\nSaldo insuficiente!\n");
                    }
                    System.out.println("------------------------------------------------------\n");
                    break;
                }
                case 4:
                {
                    double  valorTransferencia;
                    System.out.print("Informe o valor da transferencia: R$");
                    valorTransferencia = teclado.nextDouble();
                    if (valorTransferencia <= saldoCliente)
                    {
                        saldoCliente -= valorTransferencia;
                        System.out.printf("Saldo atual:......................R$%.2f\n", saldoCliente);
                        System.out.println("\nTransferência efetuada com sucesso!\n");
                    }
                    else
                    {
                        System.out.printf("Saldo atual:......................R$%.2f\n", saldoCliente);
                        System.out.println("\nSaldo insuficiente!\n");
                    }
                    System.out.println("------------------------------------------------------\n");
                    break;
                }
                case 5:
                {
                    // Lógica Sair + mensagem de saida
                }
                default:
                {
                    // Lógica Opção inválida
                }
            }
        }
        teclado.close();
    }
}