package proyectoClass;

public class Proyecto {

    private String nombre;

    private String descripcion;

    private double costoInicial;

    public Proyecto() {
    }

    public Proyecto(String nombre) {
        this.nombre = nombre;
    }

    public Proyecto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void elevatorPitch() {
        System.out.println(this.nombre + " (" + this.costoInicial + "): " + this.descripcion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCostoInicial() {
        return costoInicial;
    }

    public void setCostoInicial(double costoInicial) {
        this.costoInicial = costoInicial;
    }

}
