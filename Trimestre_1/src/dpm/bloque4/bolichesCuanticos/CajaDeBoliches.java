package dpm.bloque4.bolichesCuanticos;

import java.util.ArrayList;

public class CajaDeBoliches {
	
	private ArrayList<Boliche> boliches = new ArrayList<Boliche>();
	
	public void add(Boliche miBoliche) {
		boliches.add(miBoliche);
	}

	public float getPeso() {
		int i;
		float total = 0.0f;
		for(i=0;i<boliches.size();i++) {
			total = total + boliches.get(i).getPeso();
		}
		return total;
	}
	public int size() {
		return boliches.size();
	}
	public float getPesoMedio() {
		float media;
		if(size()!=0)
			media = getPeso()/size();
		else
			media = 0;
		return media;
	}
	public String toString() {
		String textual="";
		int i;
		// textual = String.format("Peso caja: %.2f\nBoliches dentro: %d\n",getPeso(),size());
		for (i = 0; i < boliches.size(); i++) {
			textual += boliches.get(i)+"\n"; 
		}
		return textual;
	}
}
