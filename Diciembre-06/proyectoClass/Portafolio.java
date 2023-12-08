package proyectoClass;

import java.util.ArrayList;

public class Portafolio {

    ArrayList<Proyecto> proyectos;

    public Portafolio() {
        this.proyectos = new ArrayList<Proyecto>();
    }

    public double getPortfolioCost() {
        double cost = 0;

        for (Proyecto proyecto : proyectos) {
            cost += proyecto.getCostoInicial();
        }
        return cost;
    }

    public void showPortfolio() {
        for (Proyecto proyecto : proyectos) {
            proyecto.elevatorPitch();
        }
    }

    public void agregarProyecto(Proyecto proyecto){
        this.proyectos.add(proyecto);
    }

    public ArrayList<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

}
