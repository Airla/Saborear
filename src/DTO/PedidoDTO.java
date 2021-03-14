package DTO;

import DAO.PedidoDAO;
import DAO.PedidoDAOImple;
import DTO.PedidoDTO;

public class PedidoDTO {

	private int nPedido;
	private String horaPedido;
	private String horaEntrega;
	private String data;

	public PedidoDTO(int nPedido, String horaPedido, String horaEntrega, String data) {
		super();
		this.nPedido = nPedido;
		this.horaPedido = horaPedido;
		this.horaEntrega = horaEntrega;
		this.data = data;
	}

	public PedidoDTO() {

	}

	public int getnPedido() {
		return nPedido;
	}

	public void setnPedido(int nPedido) {
		this.nPedido = nPedido;
	}

	public String getHoraPedido() {
		return horaPedido;
	}

	public void setHoraPedido(String horaPedido) {
		this.horaPedido = horaPedido;
	}

	public String getHoraEntrega() {
		return horaEntrega;
	}

	public void setHoraEntrega(String horaEntrega) {
		this.horaEntrega = horaEntrega;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	private PedidoDAO pdao = new PedidoDAOImple();

}
