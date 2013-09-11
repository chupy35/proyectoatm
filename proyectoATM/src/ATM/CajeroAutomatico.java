//Clase: CajeroAutomatico
//Autor: José Darío Rico Cadena 
//ProyectoATM 500-CIBERNETICA
package ATM;
import java.util.*;
import java.io.*;
import ATM.*;
import ATM.banco.*;
import ATM.banco.cuenta.*;
import ATM.banco.cuenta.personales.*;
import ATM.banco.cuenta.personales.utilerias.*;
import java.util.ArrayList;
public class CajeroAutomatico{
	private DespachadorDeBilletes despachador[];
	private Banco banco;
	//Necesito tu clase banco amigo para ver los nombres de los atributos como los tienes :) te la encargo porfa
	//CONSTRUCTOR
	public CajeroAutomatico(Banco banco){
		this.banco = banco;
		despachador = new DespachadorDeBilletes [5];
		despachador[0]= new DespachadorDeBilletes(20,100);
		despachador[1]= new DespachadorDeBilletes(50,100);
		despachador[2]= new DespachadorDeBilletes(100,100);
		despachador[3]= new DespachadorDeBilletes(200,100);
		despachador[4]= new DespachadorDeBilletes(500,100);
	}
	public boolean verificarNIP(String NIP){
		if(banco.verificarCliente(NIP) != -1)
			return true;
		else
			return false;
	}
	public boolean retiroEfectivo (String NIP,int cantidad){
		CuentaCheques cuenta; 
		int verificar = banco.verificarCliente(NIP);
		int billetes500=0;
		int billetes200=0;
		int billetes100=0;
		int billetes50=0;
		int billetes20=0;
		if(verificar != -1)	{
			cuenta = (CuentaCheques)(banco.clientes[verificar].getCuenta(1));
			if(cuenta instanceof CuentaCheques){
				boolean exito=cuenta.retirarACuenta(cantidad);
				if(exito){
					if(despachador[4].getNumBilletes()!=0){
						billetes500 = cantidad/500;
						cantidad = cantidad%500;
					}
					if(despachador[3].getNumBilletes()!=0){
						billetes200 = cantidad/200;
						cantidad = cantidad%200;
					}
					if(despachador[2].getNumBilletes()!=0){
						billetes100 = cantidad/100;
						cantidad = cantidad%100;
					}
					if(despachador[1].getNumBilletes()!=0){
						billetes50 = cantidad/50;
						cantidad = cantidad%50;
					}
					if(despachador[0].getNumBilletes()!=0){
						billetes20 = cantidad/20;
						cantidad = cantidad%20;
					}
					for(int i=0;i<billetes500;i++)
						despachador[4].despacharBillete();
					for(int i=0;i<billetes200;i++)
						despachador[3].despacharBillete();
					for(int i=0;i<billetes100;i++)
						despachador[2].despacharBillete();
					for(int i=0;i<billetes50;i++)
						despachador[1].despacharBillete();	
					for(int i=0;i<billetes20;i++)
						despachador[0].despacharBillete();
					return true;
			    }return false;	
			}return false;
		}return false;
	}
	public boolean depositoEfectivo (String NIP,int cantidad, int numCuenta){
		Cuenta cuenta;
		int verificar = banco.verificarCliente(NIP);
		if(verificar != -1)	{
			cuenta = banco.clientes[verificar].getCuenta(numCuenta);
			boolean exito=cuenta.depositarACuenta(cantidad);
			if(exito)
				return true;
			else 
				return false;
		} return false;
	}
	public boolean pagoServicios (String NIP,int cantidad){
		CuentaCheques cuenta; 
		int verificar = banco.verificarCliente(NIP);
		if(verificar != -1)	{
			cuenta = (CuentaCheques)(banco.clientes[verificar].getCuenta(1));
			boolean exito=cuenta.retirarACuenta(cantidad);
			if(exito)
				return true;
			else 
				return false;
		} return false;
	}
	public double consultaSaldo (String NIP,int numCuenta){
		Cuenta cuenta;
		int verificar = banco.verificarCliente(NIP);
		if(verificar != -1)	{
			cuenta = (banco.clientes[verificar].getCuenta(numCuenta));
			return cuenta.getSaldo();
		} return -1;
	}
	public void cambioNIP (String NIP,String nuevoNIP){
		Cuenta cuenta;
		int verificar = banco.verificarCliente(NIP);
		if(verificar != -1)	
			 banco.clientes[verificar].setNIP(nuevoNIP);
	}
}