package DTO;

public class EnderecoDTO {

	private String rua, bairro;
	private int numCasa;

	public EnderecoDTO(String rua, String bairro, int numCasa) {
		super();
		this.setRua(rua);
		this.setBairro(bairro);
		this.setNumCasa(numCasa);
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getNumCasa() {
		return numCasa;
	}

	public void setNumCasa(int numCasa) {
		this.numCasa = numCasa;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

}
