package proyectoClass;

public class PortafolioTest {
    public static void main(String[] args) {

        Proyecto java = new Proyecto();
        java.setCostoInicial(200);
        java.setNombre("Bootcamp Java");
        java.setDescripcion("Bootcamp Intensivo");

        Proyecto python = new Proyecto("Python");
        python.setCostoInicial(300);
        python.setDescripcion("Curso Fulltime");


        Proyecto react = new Proyecto("React", "Curso online");
        react.setCostoInicial(1000);

        Portafolio estudios = new Portafolio();
        estudios.agregarProyecto(java);
        estudios.agregarProyecto(python);
        estudios.agregarProyecto(react);


        System.out.println(estudios.getPortfolioCost());
        estudios.showPortfolio();

    }
}
