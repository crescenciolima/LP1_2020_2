
public class Main {

	public static void main(String[] args) {
		Conta x1 = new Conta("123-4", 100.0);
		Conta y2 = new Conta("555-5", 0.0);
		Conta y3 = new Conta("444-4");
		
		Poupanca p1 = new Poupanca("987-x");
		p1.creditar(100.0);
		p1.renderJuros(0.01);
		
		Poupanca p2 = new Poupanca("77-1");
		p2.creditar(50.0);
		
		//System.out.println(x1.getNumero());
		
		x1.creditar(10.0);
		//System.out.println(x1.getSaldo());
		//x1.debitar(115.0);
		//System.out.println(x1.getSaldo());
		
		Conta [] banco_contas = new Conta [5];
		banco_contas[0] = x1;
		banco_contas[1] = y2;
		banco_contas[2] = y3;
		banco_contas[3] = p1;
		banco_contas[4] = p2;
		
		//Conta [] banco2 = {x1, y2, y3};
		
		/*for(int i = 0; i < banco_contas.length; i++){
			System.out.println("================");
			System.out.println("Numero Conta: " + banco_contas[i].getNumero());
			System.out.println("Saldo da Conta: " + banco_contas[i].getSaldo());
			System.out.println("================");
		}
		*/
		
		ContaImposto imposto_1 = new ContaImposto("210-1", 100.00);
		imposto_1.debitar(10);
		imposto_1.relatorio();
		
		ContaAbstrata [] test1 = new ContaAbstrata[4];
		
		x1.relatorio();
		p1.relatorio();
		
	}
}
