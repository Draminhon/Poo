package ContaBancaria.murilo;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		Conta_bancaria conta = new Conta_bancaria();
		ContaPoupanca conta2 = new ContaPoupanca();
		
		System.out.println("Informe o nome do cliente: ");
		conta.setNomeCliente(keyboard.nextLine());
		System.out.println("Informe o numero da conta do cliente: ");
		conta.setNumConta(keyboard.nextLine());
		conta.setSaldo(3500);
		
		System.out.println("Digite o valor que o Sr." +conta.getNomeCliente() + " deseja sacar: ");
		conta.sacar(keyboard.nextDouble());
		
		System.out.println("Digite o valor para deposito");
		conta.depositar(keyboard.nextDouble());
		
		System.out.println("Digite o dia do rendimento: ");
		conta2.diaRendimento = keyboard.next();
		
		System.out.println(conta.toString());
		
		System.out.println();
		conta2.setSaldo(conta.getSaldo());
		
		System.out.println("Digite a taxa da poupanca");
		conta2.calularNovoSaldo(keyboard.nextDouble());
		System.out.println(conta2.toString());
		keyboard.close();
		
		
		

	}

}
