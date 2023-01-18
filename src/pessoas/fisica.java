package pessoas ;

public class fisica extends pessoa {

	public String nome;
	public String rg,cpf;
	@Override
	public String toString() {
		return "fisica [nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", situacaopessoa=" + situacaopessoa + "]";
	}
	
}
