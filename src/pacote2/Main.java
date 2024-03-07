package pacote2;

public class Main {

	FabricaDeAluno fabrica = new FabricaAlunoBCC(); // Única linha em que é possível identificar o curso do aluno
	Aluno aluno = fabrica.criarAluno();
	System.out.println(aluno.exibirInfo());
	
}