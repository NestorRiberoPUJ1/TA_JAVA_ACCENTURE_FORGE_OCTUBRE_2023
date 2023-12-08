package cuentaBanco;

public class BankTest {
    public static void main(String[] args) {

        BankAccount nestor = new BankAccount(100, 200);
        System.out.println(nestor.getCuenta());

        nestor.deposito(300, "ahorros");

        System.out.println(nestor.getSaldoAhorros());


    }
}
