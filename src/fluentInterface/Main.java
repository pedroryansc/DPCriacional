package fluentInterface;

public class Main {
	public static void main(String[] args) {
		
		Conexao conn = new Conexao()
				.conectarEm("127.0.0.1")
				.naPorta(8080)
				.usandoUsuario("rodrigo")
				.comASenha("teste");
		System.out.println(conn);
		
	}
}