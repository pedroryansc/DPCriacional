package builder;

public class FiatBuilder extends CarroBuilder {

	public void buildPreco() {
		carro.setPreco(33000.00);
	}
	
	public void buildDscMotor() {
		carro.setDscMotor("1.4 Flex");
	}
	
	public void buildAnoDeFabricacao() {
		carro.setAnoDeFabricacao(2018);
	}
	
	public void buildModelo() {
		carro.setModelo("Palio");
	}
	
	public void buildMontadora() {
		carro.setMontadora("Fiat");
	}
	
}