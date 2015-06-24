package Entidade;

import java.util.ArrayList;

public class Rota {
	
	private ArrayList<Cliente> listaCliente = new ArrayList<>();
	private int custoTotal;
	
	public Rota() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Cliente> getListaCliente() {
		return listaCliente;
	}

	public void setListaCliente(ArrayList<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}
	
	public void setItemListaCliente(Cliente cliente) {
		this.listaCliente.add(cliente);
	}

	public int getCustoTotal() {
		return custoTotal;
	}

	public void setCustoTotal(int custoTotal) {
		this.custoTotal = custoTotal;
	}

}
