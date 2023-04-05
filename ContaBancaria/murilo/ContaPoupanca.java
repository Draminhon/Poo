package ContaBancaria.murilo;

public class ContaPoupanca extends Conta_bancaria {

	protected String diaRendimento;
	
	  public  void calularNovoSaldo(double taxaPoupanca) {
		
		  this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaPoupanca/100));
	  }

	@Override
	public String toString() {
		String s = "Conta Poupanca[";
		s += "dia rendimento: " + diaRendimento;
		s += super.toString();
		s += "]";
		return s;
	}
	
	
}
