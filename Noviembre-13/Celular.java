
public class Celular {

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
    }

    public void ActualizarOS() {
        System.out.println("Actualizando..." + " " + marca);
        System.out.println("...");
        System.out.println("...");
        System.out.println("Actualizado");
    }

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

}
