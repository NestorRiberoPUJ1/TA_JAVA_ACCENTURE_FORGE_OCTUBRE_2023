package pitagoras;

public class Pitagoras {

    public double hipotenusa(double catetoA, double catetoB) {

        double cuadrados = (catetoA * catetoA) + (catetoB * catetoB);
        double raiz = Math.sqrt(cuadrados);
        
        return raiz;

    }

}
