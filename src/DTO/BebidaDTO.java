package DTO;

import Model.Produto;

public class BebidaDTO extends ProdutoDTO {

	private int quant_ml;
	private int quant_estoque;

	public BebidaDTO(String tipo, String preco, String descricao, String codIdentificacao, int quant_ml,
			int quant_estoque) {
		super(tipo, preco, descricao, codIdentificacao);
		this.quant_ml = quant_ml;
		this.quant_estoque = quant_estoque;
	}

	public BebidaDTO() {

	}

	public int getQuant_ml() {
		return quant_ml;
	}

	public void setQuant_ml(int quant_ml) {
		this.quant_ml = quant_ml;
	}

	public int getQuant_estoque() {
		return quant_estoque;
	}

	public void setQuant_estoque(int quant_estoque) {
		this.quant_estoque = quant_estoque;
	}

}
