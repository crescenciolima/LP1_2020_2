
public class Curso {
	private int id;
	private String nomeCurso;
	
	Curso (int id, String nomeCurso){
		this.id = id;
		this.nomeCurso = nomeCurso;
	}
	
	public void relatorioCurso(){
		System.out.println("Codigo: " + this.id);
		System.out.println("Nome do Curso: " + this.nomeCurso);
	}
	
}
