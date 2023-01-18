package pessoas;

public class pessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fisica fis = new fisica();
		juridica jur = new juridica();

		jur.nome = "Maria";
		jur.inscestadual = "995847189";
		jur.cnpj = "14565456458974";
        jur.situacaopessoa = "A";
		
        fis.nome = "Silvana";
		fis.rg = "7777777";
		fis.cpf = "11212122122";
		
		System.out.println("Dados da pessoa física:");
		System.out.println(fis.toString());
		System.out.println("Dados da pessoa Jurídica:");
		System.out.println(jur.toString());
	}

}
