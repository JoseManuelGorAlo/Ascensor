package ascensor;

import java.util.ArrayList;
import java.util.Iterator;

public class Ascensor extends Thread{
	
	
	Usuario usu;
	ArrayList<Usuario>listaUsuariosAscensor= new ArrayList<Usuario>(4);
	ArrayList<Planta>listaPlantas= new ArrayList<Planta>();
	ArrayList<Usuario>listaUsuarios=new ArrayList<Usuario>();
	int posicion=0;
	
	
	
	public Ascensor(Usuario usu, ArrayList<Usuario> listaUsuariosAscensor, ArrayList<Planta> listaPlantas,
			ArrayList<Usuario> listaUsuarios, int posicion) {
		super();
		this.usu = usu;
		this.listaUsuariosAscensor = listaUsuariosAscensor;
		this.listaPlantas = listaPlantas;
		this.listaUsuarios = listaUsuarios;
		this.posicion = posicion;
	}
	public Ascensor(ArrayList<Usuario> listaUsuariosAscensor, ArrayList<Planta> listaPlantas,
			ArrayList<Usuario> listaUsuarios, int posicion) {
	
		this.listaUsuariosAscensor = listaUsuariosAscensor;
		this.listaPlantas = listaPlantas;
		this.listaUsuarios = listaUsuarios;
		this.posicion = posicion;
	}
	public ArrayList<Usuario> getListaUsuariosAscensor() {
		return listaUsuariosAscensor;
	}
	public void setListaUsuariosAscensor(ArrayList<Usuario> listaUsuariosAscensor) {
		this.listaUsuariosAscensor = listaUsuariosAscensor;
	}
	public ArrayList<Planta> getListaPlantas() {
		return listaPlantas;
	}
	public void setListaPlantas(ArrayList<Planta> listaPlantas) {
		this.listaPlantas = listaPlantas;
	}
	public ArrayList<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}
	public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	@Override
	public String toString() {
		return "Ascensor [listaUsuariosAscensor=" + listaUsuariosAscensor + ", listaPlantas=" + listaPlantas
				+ ", listaUsuarios=" + listaUsuarios + ", posicion=" + posicion + "]";
	}
	public void moverAscensor(  ArrayList<Integer>  listadestino , int numPlanta) {
		
		int plantaActual=0;
		//haya que mover ascensor planta por planta y que se vaya preguntado si alguien quiere bajar ahi
		
			for (int i = 0; i < (numPlanta+1); i++) {
				
				plantaActual=i;
				
				System.out.println(plantaActual);
				
				if(listadestino.get(i)==plantaActual) {
					
					System.out.println(listadestino.remove(i)+"he bajado en la planta "+ i);
				
				
			}else{
			         System.out.println("sigo subiendo");	
			}
		
		}
		
	
	
	/*public void run() {
		
		//espera q que alguien le llame con notify se despierta
		
		Ascensor a = new Ascensor(usu, listaUsuariosAscensor,listaPlantas,listaUsuarios,posicion);
		
		
		while(listaUsuariosAscensor.isEmpty()) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		a.moverAscensor(usu, a);
		
		
		
		
	}*/
	
	
	}
}
