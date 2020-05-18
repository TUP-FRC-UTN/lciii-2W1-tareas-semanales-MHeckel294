/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author Pc1
 */
public class Fabrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese descripción del producto a registrar:");
        String descripción= sc.nextLine();
        System.out.println("Ingrese cantidad de materiales que posee el producto");
        int cantidad=sc.nextInt();
        Producto p=new Producto(descripción,cantidad);
        for (int i = 0; i < p.materiales.length; i++) {
            Material m=new Material();
            System.out.println("Ingrese descripción del material");
            sc.next();
            m.setDescripcion(sc.nextLine());
            System.out.println("Ingrese codigo del material");
            m.setCodigo(sc.nextInt());
            System.out.println("Ingrese precio unitario");
            m.setValorUnitario(sc.nextFloat());
            p.insertarMaterial(m);
                        
        }
        System.out.println(p.toString());
        
        System.out.println("El costo es: "+p.calcularCosto());
        System.out.println("Ingrese codigo de material a buscar");
        int codigo=sc.nextInt();
        if(p.existe(codigo))
            System.out.println("Existe ese material en el producto.");
        else
            System.out.println("No existe ese material en el producto");
        System.out.println("Ingrese un monto límite al valor de material que desea obtener:");
        Material menores[]=p.menorLimite(sc.nextFloat());
        System.out.println("Los siguientes materiales son menores al límite establecido:");
        for (int i = 0; i < menores.length; i++) {
            if(menores[i]!=null)
            {
                System.out.println(menores[i].toString());
            }
            else
                break;
        }
        
        
        int [] cantidades;
        cantidades=p.contadorRango();
        System.out.println("La cantidad de materiales con valor entre 0 y 10 son: "+cantidades[0]);
        System.out.println("La cantidad de materiales con valor entre 10 y 20 son: "+cantidades[1]);
        System.out.println("La cantidad de materiales con valor entre 20 y 30 son: "+cantidades[2]);
        System.out.println("La cantidad de materiales con valor mayor a 30 son: "+cantidades[3]);
        
    }
    
}
