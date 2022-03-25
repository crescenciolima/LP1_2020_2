
public class Concecionaria_Teste {

	public static void main(String[] args) {
		
		Automovel fusca = new Automovel(1500, 4, "vintage");
		fusca.mostrar();
		
		Caminhao scania = new Caminhao(12000, 16, 3);
		scania.mostrar();
		
		Veiculo [] bd_concecionaria = {fusca, scania};

	}

}
