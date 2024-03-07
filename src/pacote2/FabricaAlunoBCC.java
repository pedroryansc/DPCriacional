package pacote2;

public class FabricaAlunoBCC implements FabricaDeAluno {

	public Aluno criarAluno() {
		return new AlunoBCC();
	}
	
}