
public class Test_aluno_curso {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso(123, "BSI");
		
		Aluno aluno1 = new Aluno("JJ", "444", 23, curso1);
		Aluno aluno2 = new Aluno("Marcos", "555", 19, curso1);
		Aluno aluno3 = new Aluno("Paulo", "771", 30, curso1);
		
		
		Aluno [] bancoAlunos = new Aluno[3];
		bancoAlunos[0] = aluno1;
		bancoAlunos[1] = aluno2;
		bancoAlunos[2] = aluno3;
		
		aluno1.getCursoAluno().relatorioCurso();
		
		
		for(int i = 0; i < bancoAlunos.length; i++){
			System.out.println("----------------");
			bancoAlunos[i].relatorioAluno();
		}
	}
}
