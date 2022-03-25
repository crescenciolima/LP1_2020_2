
public class Aluno {
	private String nome;
	private String cpf;
	private int idade;
	private Curso cursoAluno;
	
	Aluno (String nome, String cpf, int idade, Curso cursoAluno){
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.cursoAluno = cursoAluno;
	}
	
	public void relatorioAluno(){
		System.out.println("Nome aluno: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Idade: " + idade);
		cursoAluno.relatorioCurso();
		
	}
	
	public Curso getCursoAluno(){
		return cursoAluno;
	}
	
}
