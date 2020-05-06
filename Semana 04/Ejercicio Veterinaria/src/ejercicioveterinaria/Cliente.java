
package ejercicioveterinaria;

public class Cliente {
    private int codCliente, antiguedad;
    private String nombre;
    private Mascota mascota;

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Cliente() {
        codCliente=0;
        antiguedad=0;
        nombre="";
        mascota=new Mascota();
    }

    public Cliente(int codCliente, int antiguedad, String nombre, Mascota mascota) {
        this.codCliente = codCliente;
        this.antiguedad = antiguedad;
        this.nombre = nombre;
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Cliente:\nNombre: "+nombre+"\nNº de Cliente: "+codCliente+"\nAntiguedad: "+antiguedad+" años\n"+mascota.toString();
    }
    
    
}
