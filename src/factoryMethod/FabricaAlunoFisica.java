package factoryMethod;

public class FabricaAlunoFisica implements FabricaDeAluno {
	
	public Aluno criarAluno() {
		return new AlunoFisica();
	}
	
}