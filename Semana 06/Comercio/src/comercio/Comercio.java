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
public class Comercio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente c=new Cliente(123,"Pedro","0351456789");
        
        Cliente c2=new Preferencial();
        c2.setNombre("Juan");
        c2.setNumero(35);
        c2.setTelefono("34856789");
//        c2.setDomicilio("Colon 123");
//        c2.setLimite(300);
//        c2.setSaldo(250);
        
        System.out.println(c.toString());
        System.out.println(c2.toString());
    }
    
}
