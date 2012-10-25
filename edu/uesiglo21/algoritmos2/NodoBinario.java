package edu.uesiglo21.algoritmos2;

public class NodoBinario implements Comparable{

	
	private Dato dato;
	private NodoBinario izquierdo,derecho;
	public NodoBinario(Dato dato){
		this.dato=dato;
	}
	
	
	public Dato getDato() {
		return dato;
	}


	public void setDato(Dato dato) {
		this.dato = dato;
	}


	public int compareTo(Object arg0) {
		NodoBinario nodo = (NodoBinario) arg0;
		return dato.compareTo(nodo.getDato());
	}


	public NodoBinario getDerecho() {
		return derecho;
	}


	public void setDerecho(NodoBinario derecho) {
		this.derecho = derecho;
	}


	public NodoBinario getIzquierdo() {
		return izquierdo;
	}


	public void setIzquierdo(NodoBinario izquierdo) {
		this.izquierdo = izquierdo;
	}
	

	
	

}
