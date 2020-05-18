/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

/**
 *
 * @author Pc1
 */
public class Producto {
    protected String descripcion;
    protected Material materiales[];

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Producto(String descripcion, int tamaño) {
        this.descripcion = descripcion;
        materiales=new Material[tamaño];
    }
    public void insertarMaterial(Material m)
    {
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i]==null)
            {
                materiales[i]=m;
                break;
            }
            
            
        }
    }
    
    public float calcularCosto()
    {
        float costo=0;
        for(Material x: materiales)
        {
            if(x!=null)
            costo+= x.getValorUnitario();
        }
        return costo;
        
    }
    public boolean existe(int codigo){
        for(Material x: materiales)
        {
            if(x!=null && x.getCodigo()==codigo)
                return true;
        }
        return false;
    }
    public Material[] menorLimite(float limite)
    {
        Material menoresALimite[]= new Material[materiales.length];
        int pos=0;
        for(Material x: materiales)
        {
            if(x!=null && x.getValorUnitario()<limite)
            {
                menoresALimite[pos]=x;
                pos++;
            }
            
        }
        return menoresALimite;
    }
    
    public int[] contadorRango()
    {
        int cantidades[]=new int[4];
        for(Material x: materiales)
        {
            if(x!=null)
            {
                if(x.getValorUnitario()>0 && x.getValorUnitario()<=10)
                    cantidades[0]++;
                else if (x.getValorUnitario()>10 && x.getValorUnitario()<=20)
                    cantidades[1]++;
                else if(x.getValorUnitario()>20 && x.getValorUnitario()<=30)
                    cantidades[2]++;
                else
                    cantidades[3]++;
            }
            else
                break;
        }
        return cantidades;
    }
    @Override
    public String toString() {
        String cadena="Producto:\n" + "Descripcion:" + descripcion + "\nMateriales:\n";
        for(Material x: materiales)
        {
            if(x!=null)
                cadena+= x.toString()+"\n";
        }
            
        return cadena;
    }
    
    
    
}
