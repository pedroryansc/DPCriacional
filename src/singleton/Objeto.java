package singleton;

public class Objeto { // Design pattern: Singleton - Quando preciso de instância única de um objeto

	// Atributos
	
	private static Objeto obj;
	
	private int codigo;
	private String msg;
	private boolean tipo;
	
	// Construtor privado
	
	private Objeto () {
		
	}
	
	// Métodos
	
	public static Objeto getInstance() {
		if(obj == null) // Verificação para a instanciação do primeiro e único objeto
			obj = new Objeto();
		return obj;
	}

	public static void setObj(Objeto obj) {
		Objeto.obj = obj;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public boolean isTipo() {
		return tipo;
	}

	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}

	public static String teste() {
		return "Teste deu certo";
	}
	
	// Teste à parte
	
	public static Objeto getObj() {
		return obj;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Objeto [codigo=");
		builder.append(codigo);
		builder.append(", msg=");
		builder.append(msg);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}
}
