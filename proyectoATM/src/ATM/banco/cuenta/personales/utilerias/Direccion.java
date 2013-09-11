//Clase: Direccion
//Autor: José Darío Rico Cadena 
//ProyectoATM 500-CIBERNETICA
package ATM.banco.cuenta.personales.utilerias;

public class Direccion{
	//ATRIBUTOS
	private String calle;
	private int numero;
	private String colonia;
	private String delegacion;
	private String estado;
	private String pais;
	
	//CONSTRUCTOR
	public Direccion(){
		this.calle=null;
		this.numero=0;
		this.colonia=null;
		this.delegacion=null;
		this.estado=null;
		this.pais=null;
	}
	public Direccion(String calle,int numero, String colonia, String delegacion, String estado, String pais){
		this.calle=calle;
		this.numero=numero;
		this.colonia=colonia;
		this.delegacion=delegacion;
		this.estado=estado;
		this.pais=pais;
	}
	//MÉTODOS
	public void setCalle(String calle){    	//SET
		this.calle=calle;
	}
	public void setNumero(int numero){		//SET
		this.numero=numero;
	}
	public void setColonia(String colonia){	//SET
		this.colonia=colonia;
	}
	public void setDelegacion(String delegacion){	//SET
		this.delegacion=delegacion;
	}
	public void setEstado(String estado){	//SET
		this.estado=estado;
	}
	public void setPais(String pais){		//SET
		this.pais=pais;
	}
	public String getCalle(){				//GET
		return this.calle;
	}
	public int getNumero(){					//GET
		return this.numero;
	}
	public String getColonia(){				//GET
		return this.colonia;
	}
	public String getDelegacion(){				//GET
		return this.delegacion;
	}
	public String getEstado(){				//GET
		return this.estado;
	}
	public String getPais(){				//GET
		return this.pais;
	}

	public String toString(){
		return("\n\nCalle: "+calle+"\nNumero "+numero+"\nColonia: "+colonia+"\nCiudad: "+delegacion+"\nEstado: "+estado+"\nPais: "+pais);
	}
}