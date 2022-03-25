
public class Caminhao extends Veiculo{
	private double carga;
	
	Caminhao(int motor, int n_rodas, double carga){
		super(motor, n_rodas);
		this.carga = carga;
	}
	
	public void mostrar(){
		System.out.println("Caminhao");
		System.out.println("Motor: " + motor);
		System.out.println("Numero de rodas: " + n_rodas);
		System.out.println("Carga: " + carga);
	}

}
