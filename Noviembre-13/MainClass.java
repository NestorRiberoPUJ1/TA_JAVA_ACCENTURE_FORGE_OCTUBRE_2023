
public class MainClass {
    public static void main(String[] args) {
        Celular iphone = new Celular("Apple", "Iphone XV", "Blanco", 64, 128.0);
        Celular cat = new Celular("Caterpillar", "Cat28", "Negro", 128, 256.0);

        System.out.println(iphone.getMarca());
        System.out.println(iphone.getModelo());
        iphone.ActualizarOS();
        cat.ActualizarOS();

        iphone.setMarca("Apple INC");;
        System.out.println(iphone.getMarca());
        iphone.ActualizarOS();
    }
}
