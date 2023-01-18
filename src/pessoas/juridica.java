package pessoas;

public class juridica extends pessoa {
	public String  cnpj, inscestadual;

	@Override
	public String toString() {
		return "juridica [cnpj=" + cnpj + ", inscestadual=" + inscestadual + ", nome=" + nome + ", situacaopessoa="
				+ situacaopessoa + "]";
	}

}
