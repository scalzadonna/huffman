package edu.uesiglo21.algoritmos2;

public class Dato implements Comparable {
	
	private char caracter;
	private int frecuencia;
	
	public Dato(char caracter, int frecuencia) {
		super();
		this.caracter = caracter;
		this.frecuencia = frecuencia;
	}

	public char getCaracter() {
		return caracter;
	}

	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}

	public int getFrecuencia() {
		return frecuencia;
	}




	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}

	


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return caracter + ":" + frecuencia;
	}

	public int compareTo(Object arg0) {
		Dato dato = (Dato)arg0;
		if (this.getFrecuencia()>dato.getFrecuencia())
			return 1;
		else if (this.getFrecuencia()<dato.getFrecuencia())
			return -1;
		else return 0; 
	}

}
