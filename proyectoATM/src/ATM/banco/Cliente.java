package ATM.banco;
import ATM.banco.*;
import java.util.ArrayList;
import ATM.banco.cuenta.personales.*;
import ATM.banco.cuenta.*;
public class Cliente extends Persona
{
	private String claveCliente;
	//private String RFC;
    public Cuenta []cuentas;
	private int numCuentas;
  	private String NIP;

	
	public Cliente(){
	}
		
	public Cliente(String nombre, String apellidoPaterno, String apellidoMaterno){
        super(nombre,apellidoPaterno,apellidoMaterno);
        cuentas = new Cuenta[2];
   	}
	
	
	public Cuenta getCuenta(int index){
		if(cuentas[index] != null){
			return cuentas[index];
		}
		else{
			return null;
		}
	}
	
	public boolean agregarCuentaCheques(CuentaCheques cuenta){
		cuentas[0] = cuenta;
		numCuentas++;
		return true;
	}
	public boolean agregarCuentaAhorro(CuentaAhorro cuenta){
		cuentas[1] = cuenta;
		numCuentas++;
		return true;
	}
    public int getNumCuentas(){
		return numCuentas;
	}
	
	public void setClaveCliente(String claveCliente){
		this.claveCliente = claveCliente;
	}
	
	public String getClaveCliente(){
		return claveCliente;
	}
		
	public void setNIP(String NIP){
		this.NIP = NIP;
	}
		
	public String getNIP(){
		return NIP;
	
	}
	
	

}