
/* Lenguaje de programación compilado y fuertemente tipado */
/* Para ejecutarse todo el codigo es revisado por un compilador que genera un archivo binario */
/* Toda información almacenada en variables debe estar sujeta al tipo de variable */
/* Por ejemplo una variable de tipo numerico entero solo puede almacenar valores que correspan al mismo tipo */
/* Orientado a objetos -> todo se basa en clases y modelos */
/* Solo puede existir una clase principal */
/* Con el public static void main */

public class MainClassIntro {
    public static void main(String[] args) {

        /* Primitivas */
        int edad = 26;
        char genero = 'M';
        double estatura = 1.86;
        float valor = 4.48f;
        boolean soltero = false;
        long num = 12331;
        short idiomas = 3;
        byte elemento = 4;

        /* No Primitivas */
        Integer age = 26;
        String gender = "Masculine";
        Double height = 1.86;
        Float value = 4.48f;
        Boolean married = true;
        Long number = 12331111l;
        Short languages = 3;
        Byte element = 4;

        int valorNumerico = genero;
        System.out.println(genero);
        System.out.println(valorNumerico);


    }
}
