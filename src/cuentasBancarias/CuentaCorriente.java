package cuentasBancarias;

public class CuentaCorriente extends CuentaBancaria {
    

    private int descubierto;
    
    public CuentaCorriente(String titular, int descubierto) {
   	 super(titular);
   	 this.descubierto = descubierto;
    }
    
    //Operacion Concreta
    public int getDescubierto() {
   	 return this.descubierto;
    }
    
    //Operacion Concreta
    @Override
    protected boolean condicionDeExtraccion(int monto) {
   	 return this.getSaldo() + this.getDescubierto() >= monto;
    }
    
    
}
