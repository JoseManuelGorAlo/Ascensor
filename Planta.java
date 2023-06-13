package ascensor;

import java.util.ArrayList;

public class Planta {
	
	
	int numplanta;
	
	
	
	public Planta (int numplanta) {
		this.numplanta= numplanta;
	}

	

	public int getNumplanta() {
		return numplanta;
	}

	public void setNumplanta(int numplanta) {
		this.numplanta = numplanta;
	}

	

	@Override
	public String toString() {
		return "Planta [numplanta=" + numplanta+  "]";
	}
	
	public static ArrayList crearEdificio(int numplantas, ArrayList<Planta>listaPlanta ) {
		
		listaPlanta= new ArrayList<Planta>();
		
		for (int i = 0; i < numplantas; i++) {
			
			Planta p= new Planta(i);
			
			listaPlanta.add(p);
			
			System.out.println(p.getNumplanta()+" piso");
			
		}
		System.out.println("soy el arrayList de plantas"+listaPlanta);
		return listaPlanta;
		
	}
	
	

}
