package it.polito.tdp.librettovoti.model;

import java.util.List;
import java.util.ArrayList;

public class Libretto {
	
	private List<Voto> voti;
	public Libretto() {
		this.voti=new ArrayList<>();
	}
	
	public void add(Voto v) {
		this.voti.add(v);
	}
	
	public String toString() {
		String s="";
		for(Voto v: this.voti) {
			s=s+v.toString()+"\n";
		}
		return s;
	}
	
	public List<Voto> listaVotiUguali(int punteggio){
		List<Voto> risultato= new ArrayList<>(); 
		for(Voto v: this.voti) {
			if(v.getVoto()==punteggio)
				risultato.add(v);
		}
		return risultato;
	}
	
	
	
	
	
	
}
