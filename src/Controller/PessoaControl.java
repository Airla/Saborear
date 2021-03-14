package Controller;

import DTO.PessoaDTO;
import Model.Pessoa;

public class PessoaControl {
	
	private Pessoa p;
	
	public void cadastrarPessoa(PessoaDTO pdto) {
		p.cadastrarPessoa(pdto);
	}
	
	public PessoaDTO recuperarPessoa(PessoaDTO pdto) {
		return null;
		
	}


}
