package Entidade;

import java.util.ArrayList;
import java.util.HashMap;

public class Deposito {
	
	private float coordenadaX;
	private float coordenadaY;
	private Veiculo veiculo;
	
	private ArrayList<Rota> listaRota = new ArrayList<>();
	private HashMap<Integer, Cliente> listaCliente = new HashMap<>(); 
	private float[][] matrizCustos;

	public Deposito() {
		// TODO Auto-generated constructor stub
	}

	public float getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(float coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public float getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(float coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public ArrayList<Rota> getListaRota() {
		return listaRota;
	}

	public void setListaRota(ArrayList<Rota> listaRota) {
		this.listaRota = listaRota;
	}

	public float[][] getMatrizCustos() {
		return matrizCustos;
	}

	public void setMatrizCustos(float[][] matrizCustos) {
		this.matrizCustos = matrizCustos;
	}

	public HashMap<Integer, Cliente> getListaCliente() {
		return listaCliente;
	}

	public void setListaCliente(HashMap<Integer, Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}

	public void criaCliente(String identificador, String coordenadaX, String coordenadaY,
			String demanda, String tempoInicio, String tempoFim, String string7) {
		
		Cliente cliente = new Cliente(Integer.parseInt(identificador), Float.parseFloat(coordenadaX), Float.parseFloat(coordenadaY), 
										Float.parseFloat(demanda), Float.parseFloat(tempoInicio), Float.parseFloat(tempoFim));
		
		this.listaCliente.put(Integer.parseInt(identificador), cliente);
	}

	public void criaVeiculo(String capacidade) {
		this.veiculo = new Veiculo();
		this.veiculo.setCapacidade(Integer.parseInt(capacidade));
	}
}
