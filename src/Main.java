import java.util.Scanner;;

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
        System.out.println("\n====================== MEU BANCO ======================\n");
        System.out.printf("Cliente:.........%s\n", nomeCliente);
        System.out.printf("Tipo de conta:...%s\n", tipoConta);
        System.out.printf("Saldo:...........R$%.2f\n", saldoCliente);
        System.out.println("\n=======================================================\n");

        teclado = new Scanner(System.in);
        while (opcaoCliente != 5)
        {
            System.out.println(menu);
            System.out.print("Opção: ");
            opcaoCliente = teclado.nextInt();
            if (opcaoCliente != 5)
            {
                System.out.println("\n-------------------------------------------------------\n");
            }
            switch (opcaoCliente)
            {
                case 1:
                {
                    
                    System.out.printf("Saldo atual:.....R$%.2f\n", saldoCliente);
                    System.out.println("\n-------------------------------------------------------\n");
                    break;
                }
                case 2:
                {
                    double  valorDeposito;
                    System.out.print("Informe o valor do depósito: R$");
                    valorDeposito = teclado.nextDouble();
                    if (valorDeposito <= 0)
                    {
                        System.out.println("\nValor inválido!\n\nDepósito não efetuado\n");
                        System.out.println("-------------------------------------------------------\n");
                    }
                    else
                    {
                        saldoCliente += valorDeposito;
                        System.out.printf("Saldo atual:.................R$%.2f\n", saldoCliente);
                        System.out.println("\nDepósito efetuado com sucesso!");
                        System.out.println("\n-------------------------------------------------------\n");
                    }
                    break;
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
                        System.out.println("\nSaque efetuado com sucesso!");
                    }
                    else
                    {
                        System.out.printf("Saldo atual:..............R$%.2f\n", saldoCliente);
                        System.out.println("\nSaldo insuficiente!");
                    }
                    System.out.println("\n-------------------------------------------------------\n");
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
                        System.out.println("\nTransferência efetuada com sucesso!");
                    }
                    else
                    {
                        System.out.printf("Saldo atual:......................R$%.2f\n", saldoCliente);
                        System.out.println("\nSaldo insuficiente!");
                    }
                    System.out.println("\n-------------------------------------------------------\n");
                    break;
                }
                case 5:
                {
                    System.out.println("\nO MEU BANCO agradece por utilizar nossos serviços!");
                    System.out.println("\n======================================================\n");
                    break;
                }
                default:
                {
                    System.out.println("Opção inválida!\n\nEscolha uma opção entre 1 e 5\n");
                    System.out.println("-------------------------------------------------------\n");
                }
            }
        }
        teclado.close();
    }
}