
public class Primeiro {

	public static void main(String[] args) {
		int max, a, b, c;
		a = 6;
		b = 5;
		c = 2;
		String x;
		max = (a > b) ? ((b > c) ? b : c) : b;
		System.out.println(max);
		x = (a > b) ? "Sim" : "Não";
		System.out.println(x);

	}

}
