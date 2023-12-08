package proyectoClass;

public class ProyectoTest {
    public static void main(String[] args) {
        Proyecto java = new Proyecto();
        java.setCostoInicial(200);
        java.setNombre("Bootcamp Java");
        java.setDescripcion("Bootcamp Intensivo");
        java.elevatorPitch();

        Proyecto python = new Proyecto("Python");
        python.setCostoInicial(300);
        python.setDescripcion("Curso Fulltime");
        python.elevatorPitch();

        Proyecto react = new Proyecto("React", "Curso online");
        react.setCostoInicial(1000);
        react.elevatorPitch();
    }
}
