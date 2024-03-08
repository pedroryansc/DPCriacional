package factoryMethod;

public class FabricaAlunoBCC implements FabricaDeAluno {

	public Aluno criarAluno() {
		return new AlunoBCC();
	}
	
}