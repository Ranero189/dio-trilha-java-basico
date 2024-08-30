import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Por favor, informe a agencia: ");
            int agencia = Integer.valueOf(scan.nextLine());

            System.out.println("Por favor, informe o número da conta com o dígito verificador: ");
            String numeroDaConta = scan.nextLine();

            System.out.println("Por favor, informe o seu nome e sobrenome: ");
            String nomeCliente = scan.nextLine();

            System.out.println("Por favor, informe o saldo para saque: ");
            double saldo = Double.valueOf(scan.nextLine());

            System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agencia é " + agencia +
            ", conta " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque.");
        }

    }
}
