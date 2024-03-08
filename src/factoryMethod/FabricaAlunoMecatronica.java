package factoryMethod;

public class FabricaAlunoMecatronica implements FabricaDeAluno {

	public Aluno criarAluno() {
		return new AlunoMecatronica();
	}
	
}