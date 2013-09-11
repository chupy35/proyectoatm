//Clase: Persona
//Autor: José Darío Rico Cadena 
//ProyectoATM 500-CIBERNETICA
//package personales;
package ATM.banco.cuenta.personales;
import ATM.banco.cuenta.personales.utilerias.*;

public class Persona{
	private Nombre nombre;
	private Fecha fechaNacimiento;
	private RFC rfc;
	public Direccion direccion; //MOD. UTILIZACION DE LA CLASE DIRECCION
	private int edad;
	public Persona(){
		this.nombre = new Nombre(null, null, null);
	}
	
	public Persona(String nombrePila, String apellidoPaterno, String apellidoMaterno){
		this.nombre = new Nombre(nombrePila, apellidoPaterno, apellidoMaterno);
	}
	
	public void setNombre(String nombrePila, String apellidoPaterno, String apellidoMaterno){
		this.nombre.setNombrePila(nombrePila);
		this.nombre.setApellidoPaterno(apellidoPaterno);
		this.nombre.setApellidoMaterno(apellidoMaterno);
	}
	
	public void setFechaNacimiento(int dia, int mes, int anio){
		String fecha;
		
		if( dia < 10)
			fecha = "0" + dia + "/";
		else
			fecha= dia + "/";
		
		if( mes < 10)
			fecha += "0" + mes + "/";
		else
			fecha += mes + "/";	
		
		fecha += anio;
		
		this.fechaNacimiento = new Fecha(fecha);
	}
	public void setDireccion(String calle,int numero, String colonia, String delegacion, String ciudad, String estado, String pais) //METODOS DE DIRECCION
	{
		if(direccion!=null)
		{
			direccion.setCalle(calle);
			direccion.setNumero(numero);
			direccion.setColonia(colonia);
			direccion.setDelegacion(delegacion);
			direccion.setEstado(estado);
			direccion.setPais(pais);
		}
		else
			direccion = new Direccion(calle,numero,colonia,delegacion,estado,pais);
	}
	public String getDireccion()
	{
		return direccion.toString();
	}	
	//FIN METODOS DE DIRECCION
	public String getNombre(){
		return this.nombre.toString();
	}
	
	public String getFechaNacimiento(){
		return this.fechaNacimiento.toString();
	}
	
	private int calcularEdad(){
		Fecha fechaActual;
		fechaActual = new Fecha("10102012");
		this.edad = fechaActual.anio - fechaNacimiento.anio;
		if(fechaNacimiento.mes>=fechaNacimiento.mes)
			if(fechaNacimiento.dia>fechaNacimiento.dia)
				this.edad=this.edad-1;
		return this.edad;
	}
	public String getRFC(){
		this.rfc = new RFC(this.nombre, this.fechaNacimiento);
		return this.rfc.toString();
	}
	
	public String toString(){
		return this.getNombre() + getFechaNacimiento() + getRFC();
	}
}