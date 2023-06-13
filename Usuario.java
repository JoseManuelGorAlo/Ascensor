package ascensor;

import java.util.ArrayList;
import java.util.Random;

public class Usuario extends Thread{
	int numPersonas;
	int referenciaUsuario;
    int numpulsado;
	int numPlantas;
	ArrayList<Integer>numerosPulsados;
	int destino;
	
	
	
	
	public Usuario() {
		
		
	}
	
    public Usuario(int numpersonas, int destino) {
    	this.numPersonas=numpersonas;
    	this.destino=destino;
		
		
	}
	public Usuario(ArrayList<Integer>numerosPulsados, int numPlantas) {
		this.numerosPulsados=numerosPulsados;
		this.numPlantas=numPlantas;
		
	}
	
	
	
	
	public Usuario(int referenciaUsuario, int numpulsado, int numPlantas) {
		super();
		this.referenciaUsuario = referenciaUsuario;
		this.numpulsado = numpulsado;
		this.numPlantas = numPlantas;
	}
	
	



	public ArrayList<Integer> getNumerosPulsados() {
		return numerosPulsados;
	}

	public void setNumerosPulsados(ArrayList<Integer> numerosPulsados) {
		this.numerosPulsados = numerosPulsados;
	}

	public int getReferenciaUsuario() {
		return referenciaUsuario;
	}




	public void setReferenciaUsuario(int referenciaUsuario) {
		this.referenciaUsuario = referenciaUsuario;
	}




	public int getNumpulsado() {
		return numpulsado;
	}




	public void setNumpulsado(int numpulsado) {
		this.numpulsado = numpulsado;
	}




	public int getNumPlantas() {
		return numPlantas;
	}




	public void setNumPlantas(int numPlantas) {
		this.numPlantas = numPlantas;
	}


	public int pulsarPlanta (int numPlantas) {
		
		Random r= new Random();
		
		return numpulsado= r.nextInt(1, numPlantas-1);
		
	}
	 public ArrayList<Usuario>  crearListaUsuarios(int numPersonas, int numPlantas){
		 
		 ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		 
		 for (int i = 0; i <numPersonas; i++) {
				
				Usuario usu = new Usuario();
				
				listaUsuarios.add(usu);
				System.out.println("soy el usuario "+ usu.getId());
		 }	
		 
		System.out.println(listaUsuarios);
		
		//creamos la lista de  destinos
		ArrayList<Usuario>listaUsuariosyDestinos= new ArrayList<Usuario>();
		
		for (Usuario usuario : listaUsuarios) {
			
			usuario.pulsarPlanta(numPlantas);
			listaUsuariosyDestinos.add(usuario);
			
		}
		System.out.println(listaUsuariosyDestinos.toString());
		
		return listaUsuariosyDestinos;
		 
	 }
	 
	 
	
	public void run() {
		

		Usuario u =new Usuario(numPersonas,numPlantas);
		u.crearListaUsuarios(numPersonas,numPlantas);
		
	}
	

}
