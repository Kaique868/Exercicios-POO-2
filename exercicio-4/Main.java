import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do teclado

        System.out.print("Digite o nome do titular: ");
        String titular = scanner.nextLine();

        // Criação da conta com saldo inicial igual a 0
        contaCorrente conta = new contaCorrente(numero, titular);

        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Sacar um valor");
            System.out.println("2. Depositar um valor");
            System.out.println("3. Consultar o saldo");
            System.out.println("4. Sair do programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o valor a sacar: ");
                    float valorSaque = scanner.nextFloat();
                    conta.sacar(valorSaque);
                    break;
                case 2:
                    System.out.print("Informe o valor a depositar: ");
                    float valorDeposito = scanner.nextFloat();
                    conta.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.println("Saldo atual: " + conta.consultarSaldo());
                    break;
                case 4:
                    System.out.println("A encerrar o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}