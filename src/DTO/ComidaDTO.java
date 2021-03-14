package DTO;

import Model.Produto;

public class ComidaDTO extends ProdutoDTO {

	private String tamanho;
	private String tempoPreparo;
	private String descricaoDetalhada;

	public ComidaDTO(String tipo, String preco, String descricao, String codIdentificacao, String tamanho,
			String tempoPreparo, String descricaoDetalhada) {
		super(tipo, preco, descricao, codIdentificacao);
		this.tamanho = tamanho;
		this.tempoPreparo = tempoPreparo;
		this.descricaoDetalhada = descricaoDetalhada;
	}

	public ComidaDTO() {

	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getTempoPreparo() {
		return tempoPreparo;
	}

	public void setTempoPreparo(String tempoPreparo) {
		this.tempoPreparo = tempoPreparo;
	}

	public String getDescricaoDetalhada() {
		return descricaoDetalhada;
	}

	public void setDescricaoDetalhada(String descricaoDetalhada) {
		this.descricaoDetalhada = descricaoDetalhada;
	}

}
