
package ejercicioveterinaria;

import java.util.Scanner;
public class EjercicioVeterinaria {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Cliente clientes[];
        int sumador=0, contador=0;
        double promedio;
        System.out.println("Ingrese la cantidad de clientes a procesar:");
        clientes=new Cliente[sc.nextInt()];
        for (int i = 0; i < clientes.length; i++) {
            Cliente c=new Cliente();
            System.out.println("Ingrese nombre del cliente:");
            sc.nextLine();
            c.setNombre(sc.nextLine());
            System.out.println("Ingrese código del Cliente:");
            c.setCodCliente(sc.nextInt());
            System.out.println("Ingrese antiguedad en años del cliente:");
            c.setAntiguedad(sc.nextInt());
            
            Mascota m=new Mascota();
            System.out.println("Ingrese nombre de la mascota:");
            sc.nextLine();
            m.setNombre(sc.nextLine());
            System.out.println("Ingrese edad de la mascota:");
            m.setEdad(sc.nextInt());
            
            c.setMascota(m);
            clientes[i]=c;
            System.out.println("Cliente registrado");
            //Incluyo el contador para antiguedad igual o mayor a 5 años (para ahorrar código)
            if(c.getAntiguedad()>=5)
                contador++;
        }
        
        System.out.println("La cantidad de clientes es de: "+clientes.length);
        for (int i = 0; i < clientes.length; i++) {
            sumador+= clientes[i].getMascota().getEdad();
            
        }
        promedio= (double) sumador/clientes.length;
        System.out.println("El promedio de edad de las mascotas es: "+promedio+" años.");
        
        System.out.println("La cantidad de clientes con 5 años o más de antiguedad son: "+contador+" clientes.");
    }
    
}
