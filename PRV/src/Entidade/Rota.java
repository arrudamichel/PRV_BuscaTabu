package Entidade;

import java.util.ArrayList;

public class Rota {
	
	private ArrayList<Cliente> listaCliente = new ArrayList<>();
	private Double custoTotal = 0.0;
	
	public Rota() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Cliente> getListaCliente() {
		return listaCliente;
	}

	public void setListaCliente(ArrayList<Cliente> listaCliente) {
		
		for (Cliente cliente : listaCliente) {
			this.listaCliente.add(cliente);
		}				
	}
	
	public void setItemListaCliente(Cliente cliente) {
		this.listaCliente.add(cliente);
	}

	public Double getCustoTotal() {
		return custoTotal;
	}

	public void setCustoTotal(Double custoTotal) {
		this.custoTotal = custoTotal;
	}

}
