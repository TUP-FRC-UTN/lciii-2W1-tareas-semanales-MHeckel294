/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comercio;

/**
 *
 * @author Pc1
 */
public class Preferencial extends Cliente{
    protected float saldo, limite;
    protected String domicilio;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }


    public Preferencial() {
        super();
        saldo=0;
        limite=0;
        domicilio="";
    }
    
    public Preferencial(int numero, String nombre, String telefono, float saldo, float limite, String domicilio)
    {
        super(numero, nombre, telefono);
        this.saldo=saldo;
        this.limite=limite;
        this.domicilio=domicilio;
    }

    @Override
    public String toString() {
        return super.toString()+"Preferencial{" + "saldo=" + saldo + ", limite=" + limite + ", domicilio=" + domicilio + '}';
    }

    
    
    
    
}
