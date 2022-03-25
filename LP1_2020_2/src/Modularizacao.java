
public class Modularizacao {

	static void cabecalho(){
		System.out.println("Instituto Federal da Bahia");
	}
	
	static double quadrado(double n1){
		double total; 
		total = n1*n1;
		return total;
	}
	
	static int quadrado(int x){
		return x*x;
	}
	
	static double quadrado(int x, int y){
		return x*y;
	}
	
	static String quadrado(String numero){
		return "Este calculo eu nao consigo fazer";
	}
	
	
	public static void main(String[] args) {
		cabecalho();
		System.out.println(quadrado(2.0));
		System.out.println(quadrado(5));
		System.out.println(quadrado(2, 5));
		System.out.println(quadrado("dois"));
	
	}
}
