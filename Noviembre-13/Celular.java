import java.util.ArrayList;

public class Celular {

    private static String operador = "Entel";
    private static ArrayList<Celular> celulares = new ArrayList<Celular>();
    private static Double red = 1.0;

    private String marca;
    private String modelo;
    private String color;
    private Integer ram;
    private Double memory;

    public Celular(String marca, String modelo, String color, Integer ram, Double memory) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.ram = ram;
        this.memory = memory;
        celulares.add(this);
    }

    public Celular(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = "blanco";
        this.ram = 2;
        this.memory = 128.0;
        celulares.add(this);
    }

    public Celular() {

    }

    public void ActualizarOS() {
        System.out.println("Actualizando..." + " " + marca);
        System.out.println("...");
        System.out.println("...");
        System.out.println("Actualizado para " + operador);
    }

    public static void MejorarRed() {
        red += 0.1;
    }

    /* Getters y Setters De variable de instancia */
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Double getMemory() {
        return memory;
    }

    public void setMemory(Double memory) {
        this.memory = memory;
    }

    /* Getters y Setters de variables de clase */
    public static String getOperador() {
        return operador;
    }

    public static void setOperador(String operador) {
        Celular.operador = operador;
    }

    public static ArrayList<Celular> getCelulares() {
        return celulares;
    }

    public static void setCelulares(ArrayList<Celular> celulares) {
        Celular.celulares = celulares;
    }

    public static Double getRed() {
        return red;
    }

    public static void setRed(Double red) {
        Celular.red = red;
    }

}
