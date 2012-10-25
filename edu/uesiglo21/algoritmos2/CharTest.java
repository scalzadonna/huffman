package edu.uesiglo21.algoritmos2;

import java.util.PriorityQueue;

public class CharTest {

	public static void main (String args[]){
		int[] frec = new int[256];
		String mensaje = "carambolas cAramboLIllas"; 
			
			
		for(char c:mensaje.toCharArray()){
			frec[c]++;
		}
		
		
		//mostrar array
		PriorityQueue<NodoBinario> filas = new PriorityQueue<NodoBinario>();
		
		for (int pos=0;pos<frec.length;pos++){
			if (frec[pos]>0){
				filas.add(new NodoBinario(new Dato(Character.toChars(pos)[0],frec[pos])));
			}
			
		}
		

		
		while(filas.size()>1){
			NodoBinario der = filas.poll();
			NodoBinario izq = filas.poll();
			NodoBinario nuevo = new NodoBinario(new Dato('$',der.getDato().getFrecuencia()+izq.getDato().getFrecuencia()));
			nuevo.setDerecho(der);
			nuevo.setIzquierdo(izq);
			filas.add(nuevo);
		}
		
		while(!filas.isEmpty()){
		NodoBinario nodo = filas.poll();
		if (nodo.getIzquierdo()!=null){
			System.out.println(nodo.getIzquierdo().getDato().toString());
		}
		if (nodo.getDerecho()!=null){
			System.out.println(nodo.getDerecho().getDato().toString());
		}
		
	}
		
		
		
	}
	
}
