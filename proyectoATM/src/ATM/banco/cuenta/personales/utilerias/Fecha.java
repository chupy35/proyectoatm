package ATM.banco.cuenta.personales.utilerias;

public class Fecha{
	public int dia;
	public int mes;
	public int anio;
	
	//Constructor
	public Fecha(){
		this.dia = 1;
		this.mes = 1;
		this.anio = 2000;
	}
	
	public Fecha(String fecha){
		int d = 0;
		int m = 0;
		int a = 0;
		
		d= Integer.parseInt(fecha.substring(0,2));
		m= Integer.parseInt(fecha.substring(3,5));
		a= Integer.parseInt(fecha.substring(6,10));
		
		if(validarFecha(d, m, a) == true){
			this.dia = d;
			this.mes = m;
			this.anio = a;
		}
		else
		{
			System.out.println("\nFecha ingresada no valida\n");
			this.dia=1;
			this.mes=1;
			this.anio=2000;
		}
		
	}

	public void setDia(int dia){
		this.dia = dia;
	}
	
	public void setMes(int mes){
		this.mes = mes;
	}
	
	public void setAnio(int anio){
		this.anio = anio;
	}
	
	public int getDia(){
		return this.dia;
	}
	
	public int getMes(){
		return this.mes;
	}
	
	public int getAnio(){
		return this.anio;
	}
	
	private boolean validarFecha(int dia, int mes, int anio){
		
		if( anio > 1000 )
		{
			if( (mes > 0) && (mes <=12))
			{
				if( (mes==4) || (mes==6) || (mes==5) || (mes==9) || (mes==11))
				{
					if((dia > 0) && (dia <= 30))
						return true;
					else
						return false;
				}
				else
				{
					if( mes==2)
					{
						if( (anio %4==0) && ( anio%100!= 0  || anio%400==0 ) && (dia>0) && (dia<=29) )
							return true;
						else
						{
							if((dia>0) && (dia<=28))
								return true;
							else
								return false;
						}
					}
					else
					{
						if((dia>0) && (dia<= 31))
							return true;
						else
							return false;
					}
				}
			}
			else
				return false;
		}
		else
			return false;
	
	}
	
	public String toString(){
	
	   String fecha = new String();
		
		if( getDia() < 10)
			fecha = "0" + getDia() + "/";
		else
			fecha= getDia() + "/";
		
		if( getMes() < 10)
			fecha += "0" + getMes() + "/";
		else
			fecha += getMes() + "/";	
		
		return "\nFecha de Nacimiento: " + fecha + getAnio();
	}
}