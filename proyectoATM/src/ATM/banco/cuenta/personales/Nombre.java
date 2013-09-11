package ATM.banco.cuenta.personales;
import ATM.banco.cuenta.personales.utilerias.*;

public class Nombre{
	private String nombrePila;
	private String apellidoPaterno;
	private String apellidoMaterno;
	
	public Nombre(String nombrePila, String apellidoPaterno, String apellidoMaterno){
		this.nombrePila = nombrePila;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
	}
	
	public void setNombrePila(String nombrePila){
		this.nombrePila = nombrePila;
	}
	
	public void setApellidoPaterno(String apellidoPaterno){
		this.apellidoPaterno = apellidoPaterno;
	}
	
	public void setApellidoMaterno(String apellidoMaterno){
		this.apellidoMaterno = apellidoMaterno;
	}
	
	public String getNombrePila(){
		return this.nombrePila;
	}
	
	public String getApellidoPaterno(){
		return this.apellidoPaterno;
	}
	
	public String getApellidoMaterno(){
		return this.apellidoMaterno;
	}
	
	public String toString(){
		return "\nNombre: " + this.nombrePila + " " + this.apellidoPaterno + " " + this.apellidoMaterno; 
	}
}