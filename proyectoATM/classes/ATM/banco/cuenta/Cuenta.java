//CLASE: CUENTA
package ATM.banco.cuenta;

public class Cuenta{

	public double saldo;
	
	public Cuenta(double saldoInicial){
		saldo = saldoInicial;	
	}
	
	public double getSaldo(){
		return saldo;
	}
		
	public boolean depositarACuenta(double cantidad){
		saldo = saldo + cantidad;
		return true;
	}
	
	public boolean retirarACuenta(double cantidad){
		saldo = saldo - cantidad;
		return true;
	}

}