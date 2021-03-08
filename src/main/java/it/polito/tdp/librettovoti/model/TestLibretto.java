package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {
	
	public static void main(String[] args) {
	
	Libretto libretto=new Libretto();
	Voto voto1= new Voto("Analisi1", 30, LocalDate.of(2019,2,15));
	libretto.add(voto1);
	System.out.println(libretto);
	
	List<Voto> venticinque= libretto.listaVotiUguali(25);
	System.out.println(venticinque);
	
	}
	

}
