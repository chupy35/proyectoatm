package ATM.banco;

import ATM.banco.cuenta.personales.*;
import ATM.banco.cuenta.*;
import java.util.ArrayList;
public class Banco{
	public Cliente clientes[];
	public int numClientes;
	public String nomBanco;
	
	public Banco( String nomBanco){
		this.nomBanco = nomBanco;
		clientes = new Cliente[100];
		numClientes = 0;
	}
	
	public void agregarCliente(String nombre,String apellidoPaterno,String apellidoMaterno,String NIP,String claveClientes ){
		clientes[numClientes] = new Cliente(nombre,apellidoPaterno,apellidoMaterno);
		clientes[numClientes].setNIP(NIP);
		clientes[numClientes].setClaveCliente(claveClientes);
		numClientes++;
	}
	public void eliminarCliente(int indice ){
		for(int i=indice;i<this.numClientes;i++)
			clientes[i] = clientes[i+1];
		numClientes--;
	}
	public String getNomBanco(){
		return this.nomBanco;
	}
	public int verificarCliente(String NIP ){
		for(int i=0;i<this.numClientes;i++){
			if(clientes[i].getNIP() == NIP)
				return i;
		}
		return -1;
	}
	
	
	//agregar cuenta lo hace desde cliente u.u
	
}