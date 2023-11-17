import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Celular iphone = new Celular("Apple", "Iphone XV", "Blanco", 64, 128.0);
        Celular cat = new Celular("Caterpillar", "Cat28", "Negro", 128, 256.0);

        System.out.println(iphone.getMarca());
        System.out.println(iphone.getModelo());
        iphone.ActualizarOS();
        cat.ActualizarOS();

        iphone.setMarca("Apple INC");
        ;
        System.out.println(iphone.getMarca());
        iphone.ActualizarOS();

        Celular xiaomi = new Celular("xiaomi", "x9");
        xiaomi.ActualizarOS();
        String[] sensores = { "Cámara términca", "Gyro", "Probe" };
        CelularUtilitario caterpillar = new CelularUtilitario("Caterpillar", "G29", "Amarillo Caterpillar", 8, 256.0,
                sensores);
        caterpillar.ActualizarOS();
        new Celular("redmi", "r10");
        System.out.println(Celular.getOperador());
        System.out.println(Celular.getCelulares());

        Celular.getCelulares().get(3).ActualizarOS();

        Celular.setOperador("AT&T");
        System.out.println(Celular.getOperador());
        System.out.println(Celular.getRed());
        Celular.MejorarRed();
        System.out.println(Celular.getRed());

        ArrayList<Celular> moviles = new ArrayList<Celular>() {
            {
                add(caterpillar);
                add(iphone);
                add(xiaomi);
            }
        };

        System.out.println(moviles);

        ArrayList<Celular> mov2 = new ArrayList<Celular>(List.of(caterpillar, iphone, xiaomi));
        /* =[ob1,ob2,ob3] */
        System.out.println(mov2);
    }
}
