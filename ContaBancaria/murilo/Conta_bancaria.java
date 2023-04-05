package ContaBancaria.murilo;

public class Conta_bancaria {

	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	public void sacar(double valor) {
		
		saldo = saldo-valor;
		
		if(saldo<0.0) {
			System.out.println("Saque inválido! Tente novamente com um novo valor!");
			saldo = saldo+valor;
		}}
		
	
	
	@Override
	public String toString() {
		return "Conta_bancaria [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + "]";
	}



	public String getNomeCliente() {
		return nomeCliente;
	}



	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}



	public String getNumConta() {
		return numConta;
	}



	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public void depositar(double valor) {
		
		saldo = saldo+valor;
}
}