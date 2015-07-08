package Entidade;

public class Cliente {
	
	private int identificador;
	private float coordenadaX;
	private float coordenadaY;
	private float demanda;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	
	public Cliente(int identificador, float coordenadaX, float coordenadaY,	float demanda) {
		super();
		this.identificador = identificador;
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		this.demanda = demanda;
	}


	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
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

	public float getDemanda() {
		return demanda;
	}

	public void setDemanda(float demanda) {
		this.demanda = demanda;
	}
}
