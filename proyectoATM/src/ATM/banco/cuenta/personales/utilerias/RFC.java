package ATM.banco.cuenta.personales.utilerias;
import ATM.banco.cuenta.personales.Nombre;
import ATM.banco.cuenta.personales.Persona;
import ATM.banco.cuenta.personales.utilerias.*;
import java.util.Random;

public class RFC{
	private String iniciales;
	private String fechaNacimiento;
	private String homoclave;
	
	public RFC(Nombre nombre, Fecha fechaNacimiento){
		formarIniciales(nombre);
		formarFechaNacimiento(fechaNacimiento);
		formarHomoclave();
	}
	
	private void formarIniciales(Nombre nombre){
		char prim_vocal = '\0';
		String apellidoPat;
		
		apellidoPat = nombre.getApellidoPaterno().toUpperCase();
	
		System.out.println("apellido: " + apellidoPat);
		
		for( int i=1, band=0; i< apellidoPat.length() && band==0; i++){
			
			prim_vocal = apellidoPat.charAt(i);
			if((prim_vocal == 65) || (prim_vocal == 69) || (prim_vocal == 73) || (prim_vocal == 79) || (prim_vocal == 85))
				band=1;
		}
		
		this.iniciales= "" + apellidoPat.charAt(0) + prim_vocal + 
						nombre.getApellidoMaterno().charAt(0) + nombre.getNombrePila().charAt(0);
		
		this.iniciales = this.iniciales.toUpperCase();
	}
	
	private void formarFechaNacimiento(Fecha fechaNacimiento){
		String dia,mes,anio;
		
		anio= String.valueOf(fechaNacimiento.getAnio());
		anio = anio.substring(2,4);
		
		if( fechaNacimiento.getMes() < 10)
			mes= "0" + fechaNacimiento.getMes();
		else
			mes= String.valueOf(fechaNacimiento.getMes());
		
		if( fechaNacimiento.getDia() < 10)
			dia= "0" + fechaNacimiento.getDia();
		else
			dia= String.valueOf(fechaNacimiento.getDia());
		

		this.fechaNacimiento=anio+mes+dia;
		
	}
	
	private void formarHomoclave(){
		Random rand = new Random();
		int n=(int)(rand.nextDouble()*10); 
		char letra=(char)((rand.nextDouble()*26)+65);
		char letra1=(char)((rand.nextDouble()*26)+65);
		
		this.homoclave=""+letra+letra1+n;
		
		this.homoclave.toUpperCase();
		
	}
	
	public String toString(){
		return "\nRFC: " + this.iniciales + this.fechaNacimiento + this.homoclave;
	}
	
}