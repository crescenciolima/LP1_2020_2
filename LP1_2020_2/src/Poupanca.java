
public class Poupanca extends Conta{
	Poupanca(String numero){
		super(numero);
	}
	
	public void renderJuros(double taxa){
		this.creditar(saldo*taxa);
	}
}
