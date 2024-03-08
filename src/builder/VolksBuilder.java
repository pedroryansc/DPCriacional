package builder;

public class VolksBuilder extends CarroBuilder {

	public void buildPreco() {
		carro.setPreco(43000.00);
	}
	
	public void buildDscMotor() {
		carro.setDscMotor("1.6 Flex");
	}
	
	public void buildAnoDeFabricacao() {
		carro.setAnoDeFabricacao(2017);
	}
	
	public void buildModelo() {
		carro.setModelo("Gol");
	}
	
	public void buildMontadora() {
		carro.setMontadora("Volkswagen");
	}
	
}
