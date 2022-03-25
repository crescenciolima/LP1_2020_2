
public class Conta extends ContaAbstrata{
	
	public Conta(String numeroInicial, double saldoInicial){
		super(numeroInicial, saldoInicial);
	}
	
	public Conta(String numeroInicial){
		super(numeroInicial);
	}
	
	public void debitar(double valor){
		if(saldo >= valor){
			saldo -= valor;
		}else{
			System.out.println("Saldo Insuficiente");
		}
	}
	
	public String getNumero(){
		return numero;
	}
	
	public void setNumero(String numeroTemp){
		numero = numeroTemp;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public void setSaldo(double saldoTemp){
		saldo = saldoTemp;
	}
	
	

}
