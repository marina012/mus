package es.cic.taller.juegoCartas;

public class Carta {
	private String palo;
	private int numero;
	
	public Carta(int numero, String palo) {
		this.numero=numero;
		this.palo=palo;
	}
	public String getPalo() {
		return palo;
	}
	
	public int getNumero() {
		return numero;
	}
	


}
