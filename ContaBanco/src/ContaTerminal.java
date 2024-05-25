import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        // Leitura dos dados da conta bancária e dados do cliente
        System.out.println("Por favor, digite o número da conta:");
        numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência e digito verificador:");
        agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente:");
        scanner.nextLine();
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        saldo = scanner.nextDouble();

        // Exibindo a mensagem final com concatenação
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " + "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}