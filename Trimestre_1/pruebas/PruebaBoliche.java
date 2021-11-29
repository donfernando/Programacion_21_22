

import dpm.bloque4.bolichesCuanticos.Boliche;
import dpm.bloque4.bolichesCuanticos.CajaDeBoliches;

public class PruebaBoliche {

	public static void main(String[] args) {
		
		Boliche bolich1 = new Boliche("K1");
		Boliche bolich2 = new Boliche("K2");
		CajaDeBoliches caja = new CajaDeBoliches();

		System.out.println(bolich1);
		System.out.println(bolich1.getPeso());
		System.out.println(bolich1);
		System.out.println(bolich1.getColor());
		System.out.println(bolich1);
		caja.add(bolich1);
		caja.add(bolich2);
		System.out.println("Caja_____");
		System.out.println(caja);
		System.out.println("Peso: "+caja.getPeso());
		System.out.println("Caja_____");
		System.out.println(caja);
	}

}
