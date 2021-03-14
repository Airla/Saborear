package DTO;

public class AtendenteDTO extends Pessoa {
	
	public AtendenteDTO(String nome, String cpf, String email, String senha, String confirmeSenha, String codigo,
			int tipo) {
		super(nome, cpf, email, senha, confirmeSenha, codigo, tipo);
	}

	public AtendenteDTO() {
	}
	

}
