import java.util.Date;

public class EstudianteTest {

    public static void main(String[] args) {

        /* Primitivas */
        int edad = 26;
        long celular = 310987654;
        char genero = 'M';
        boolean graduado = true;
        double pi = 3.14159264;
        float n1 = 24f;

        /* No primitivas -> Objetos -> clases */
        Integer age = 26;
        Long cellphone = 31231231L;
        String gender = "Masculine";
        Boolean graduated = true;
        Double euler = 4.68321;
        Float n2 = 1321f;

        long start = System.currentTimeMillis();
        for (int index = 0; index < Integer.MAX_VALUE; index++) {

        }
        long end = System.currentTimeMillis();
        double total = (double) (end - start) / 1000;
        System.out.println("Tiempo de ejecucion: " + total + " segundos");

        /* Casting de variables */

        int platos = 24;

        double recetas = 14.0;

        String perros = "12";

        platos = (int) recetas;
        recetas = platos;

        Double.parseDouble(perros);
        platos = Integer.parseInt(perros);

        char hola = 12;


        Estudiante nestor = new Estudiante();


        Date cumple= new Date();
       
    }

}
