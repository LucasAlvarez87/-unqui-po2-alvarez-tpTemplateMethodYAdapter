package cuentasBancarias;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria {
    
    private String titular;
    private int saldo;
    private List <String> movimientos;
    
    public CuentaBancaria(String titular) {
   	 super();
   	 this.titular = titular;
   	 this.movimientos = new ArrayList<String>();
    }

    // Operacion Concreta
    public int getSaldo() {
   	 return saldo;
    }
    
    //Operacion Concreta
    public void setSaldo(int saldo) {
   	 this.saldo = saldo;
    }
    
    //Operacion Concreta
    public String getTitular() {
   	 return titular;
    }
    
    //Operacion Concreta
    public void agregarMovimientos(String movimiento) {
   	 this.movimientos.add(movimiento);
    }
    
    //Temple method
    public void extraer(int monto) {
   	 if(this.condicionDeExtraccion(monto) ) { // Operacion Concreta
   		 this.setSaldo(this.getSaldo() - monto);
   		 this.agregarMovimientos("Extraccion");
   	 }
    }
    
    public void depositar(int monto) {
    	this.setSaldo(this.getSaldo() + monto);
    }
    
    //Operacion Primitiva
    protected abstract boolean condicionDeExtraccion(int monto) ;
    
}
