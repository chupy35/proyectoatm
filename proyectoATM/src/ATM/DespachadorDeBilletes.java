//Clase: DespachadorDeBilletes
//Autor: José Darío Rico Cadena 
//ProyectoATM 500-CIBERNETICA
package ATM;
import ATM.banco.cuenta.*;
import ATM.banco.cuenta.personales.*;
import ATM.banco.cuenta.personales.utilerias.*;
import java.util.*;
import java.io.*;
public class DespachadorDeBilletes{
	//ATRIBUTOS
	private int denominacion;
	private int numBilletes;
	
	//CONSTRUCTOR
	public DespachadorDeBilletes(int denominacion, int numBilletes){
		this.denominacion = denominacion;
		this.numBilletes = numBilletes;
	}
	
	//METODOS
	public int getDenominacion(){
		return this.denominacion;
	}
	public int getNumBilletes(){
		return this.numBilletes;
	}
	public void despacharBillete(){
		if(this.numBilletes<1)
			System.out.println("SE ACABARON LOS BILLETES");
		else
			this.numBilletes = this.numBilletes - 1;
	}
	public String toString(){
		return ("Denominación: "+denominacion+"\nExistencia: "+numBilletes);
	}
}