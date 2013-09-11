//CLASE: CuentaAhorro
package ATM.banco.cuenta;
import ATM.banco.cuenta.*;
import ATM.banco.*;
public class CuentaAhorro extends Cuenta 
{
	private double tasaInteres;
		
	public CuentaAhorro(double saldoInicial,double tasaInteres)
	{
		super(saldoInicial);
		this.tasaInteres = tasaInteres;
    }
	
	public void setTasaInteres(){
		this.tasaInteres = tasaInteres;
		}
	
	public double getTasaInteres(){
		return tasaInteres;
	}

	//public boolean retirarACuenta(double cantidad){  // sin esto el compilador no me lo quiero aceptar -.- pero no debería de ir aqui sino en cuenta cheques -.-"
	
	//	saldo = saldo - cantidad;
	//	return true;
	//}
	
}