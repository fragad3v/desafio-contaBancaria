import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args){
        int numero;
        int agencia;
        String nomeClient;
        double saldo;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o número de seu banco: ");
        numero = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Informe o numero de sua agência: ");
        agencia = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Informe seu nome: ");
        nomeClient = teclado.next();
        teclado.nextLine();

        System.out.println("Informe seu saldo: ");
        saldo = teclado.nextDouble();
        teclado.close();


        System.out.println("-------------------------------------------------");
        System.out.println("---------------####################--------------");
        System.out.println("Olá! Obrigado por criar uma conta em nosso banco!");
        System.out.println("Aqui vai as informações da sua conta...\n1");
        System.out.println("Numero:... " + numero);
        System.out.println("Agência:... " + agencia);
        System.out.println("Nome:... " + nomeClient);
        System.out.println("Saldo:... R$" + saldo);
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
    }
}