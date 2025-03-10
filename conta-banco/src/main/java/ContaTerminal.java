import java.util.*;

public class ContaTerminal {
    public static void main(String[] args) {
        final Scanner SCANNER = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o número da conta: ");
        int numeroConta = SCANNER.nextInt();
        SCANNER.skip("\n");

        System.out.print("Digite a agência: ");
        String agencia = SCANNER.nextLine();

        System.out.print("Digite o nome: ");
        String nomeCliente = SCANNER.nextLine();

        System.out.print("Digite o saldo: ");
        Double saldoConta = SCANNER.nextDouble();

        String mensagem = String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque",
                nomeCliente, agencia, numeroConta, saldoConta
        );
        System.out.println(mensagem);
    }
}
