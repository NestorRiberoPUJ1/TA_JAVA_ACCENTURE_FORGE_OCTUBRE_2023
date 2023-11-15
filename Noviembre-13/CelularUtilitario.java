
public class CelularUtilitario extends Celular {

    private String[] sensors;

    public CelularUtilitario(String marca, String modelo, String color, Integer ram, Double memory, String[] sensors) {
        super(marca, modelo, color, ram, memory);
        this.sensors = sensors;
    }

    @Override
    public void ActualizarOS() {
        System.out.println("Calibrando todos los sensores...");
        super.ActualizarOS();
    }

    public String[] getSensors() {
        return sensors;
    }

    public void setSensors(String[] sensors) {
        this.sensors = sensors;
    }

}
