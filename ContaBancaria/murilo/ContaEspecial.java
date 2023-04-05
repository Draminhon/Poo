package ContaBancaria.murilo;

public class ContaEspecial extends Conta_bancaria{

	protected double limite;
	
	public void sacar(double valor) {
		double ai;
		ai = super.getSaldo() - valor;
		super.setSaldo(ai);
		 if(valor>limite) {
			 System.out.println("Impossível realizar o saque");
			 super.setSaldo(ai+valor);
		 }
		
	}
	
	
}
