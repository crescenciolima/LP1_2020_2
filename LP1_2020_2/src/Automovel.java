
public class Automovel extends Veiculo {
	private String tipo;
	
	Automovel(int motor, int n_rodas, String tipo){
		super(motor, n_rodas);
		this.tipo = tipo;
	}
	
	public void mostrar(){
		System.out.println("Automovel");
		System.out.println("Motor: " + motor);
		System.out.println("Numero de rodas: " + n_rodas);
		System.out.println("Tipo: " + tipo);
	}
	
}
