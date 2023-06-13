package ascensor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int numPersonas;
		int numPlanta;
		boolean esta;
		Ascensor ascensor;
		Usuario usuario;
		
		
		ArrayList<Usuario>listaUsuarios = new ArrayList<Usuario>() ;
		ArrayList<Usuario>usuariosAscensor= new ArrayList<Usuario>(4);
		ArrayList<Planta>listaPlantas=new ArrayList<Planta>();
		ArrayList<Integer>resultadosDePulsar= new ArrayList<Integer>();
		ArrayList<Integer>listadestino =new ArrayList<Integer>();
		
		//pedimos los datos a los usuarios
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Elige el numero de plantas del edificio");
		numPlanta=sc.nextInt()+1;
		
		//creamos el edificio a recorrer
		
		Planta planta= new Planta(numPlanta);
		planta.crearEdificio(numPlanta,listaPlantas);
		System.out.println("Edificio creado");
		
		//pintar el ascensor
		
		for(int i=0; i<numPlanta; i++) {
			
			System.out.println("Planta "+i+"| "+ " |");
			
		}
		//pedimos el numero de personas
		
		System.out.println("Cuantas personas hay en el portal??");
		numPersonas=sc.nextInt();
	
		Usuario u =new Usuario(numPersonas,numPlanta);
		u.start();
		
	
	
		 
		 
		
		/*
		//arraco el ascensor
		ascensor= new Ascensor(usuariosAscensor, null, listaUsuarios, numPlanta);
		ascensor.start();
		
		pintar el ascensor
		for(int i=0; i<numPlanta; i++) {
			
			System.out.println("Planta "+i+"| "+ " |");
			
		}
		//*/
		
		
	}

}
