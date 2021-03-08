package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

public class TestLibretto {
	
	public static void main(String[] args) {
	
	Libretto libretto=new Libretto();
	Voto voto1= new Voto("Analisi1", 30, LocalDate.of(2019,2,15));
	libretto.add(voto1);
	
	}
	

}
