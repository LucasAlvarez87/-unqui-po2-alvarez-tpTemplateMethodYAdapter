package cuentasBancarias;

public class CajaDeAhorro extends CuentaBancaria {

    private int limite;
    
    public CajaDeAhorro(String titular, int limite) {
   	 super(titular);
   	 this.limite = limite;
    }
    
 // Operacion Concreta
    public int getLimite() {
   	 return this.limite;
    }
    
 // Operacion Concreta
    @Override
    protected boolean condicionDeExtraccion(int monto) {
   	 return this.getSaldo() >= monto && this.getLimite() >= monto;
    }

}
