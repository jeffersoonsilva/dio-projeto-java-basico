import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o número da conta: ");
        int numeroConta = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Informe o número da agência: ");
        String numeroAgencia = entrada.nextLine();
        System.out.println("Informe Seu nome completo: ");
        String nomeCliente = entrada.nextLine();
        System.out.println("Informe o saldo: ");
        double saldo = entrada.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
