
public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora baldor = new Calculadora();


        baldor.setOperandOne(10.5);
        baldor.setOperation("+");
        baldor.setOperandTwo(5.2);
        baldor.performOperation();
        System.out.println(baldor.getResult());
    }
}
