package factoryMethod;

public class Main {
	public static void main(String[] args) {
	
		FabricaDeAluno fabrica = new FabricaAlunoBCC(); // Única linha em que é possível identificar o curso do aluno
		Aluno aluno = fabrica.criarAluno();
		System.out.println(aluno.exibirInfo());
		
		fabrica = new FabricaAlunoFisica(); // Única linha em que é possível identificar o curso do aluno
		aluno = fabrica.criarAluno();
		System.out.println(aluno.exibirInfo());
		
		fabrica = new FabricaAlunoMecatronica(); // Única linha em que é possível identificar o curso do aluno
		aluno = fabrica.criarAluno();
		System.out.println(aluno.exibirInfo());
	}
}