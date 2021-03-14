package DTO;

public class ProdutoDTO {

	private String tipo;
	private String preco;
	private String descricao;
	private String codIdentificacao;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodIdentificacao() {
		return codIdentificacao;
	}

	public void setCodIdentificacao(String codIdentificacao) {
		this.codIdentificacao = codIdentificacao;
	}

	public ProdutoDTO(String tipo, String preco, String descricao, String codIdentificacao) {
		this.tipo = tipo;
		this.preco = preco;
		this.descricao = descricao;
		this.codIdentificacao = codIdentificacao;
	}

	public ProdutoDTO() {

	}

}
