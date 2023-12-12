package cuentaBanco;

public class BankTest {
    public static void main(String[] args) {

        BankAccount nestor = new BankAccount(100, 200);
        System.out.println(nestor.getCuenta());

        nestor.deposito(300, "ahorros");
        System.out.println(nestor.getSaldoAhorros());

        nestor.retiro(200, "ahorros");
        System.out.println(nestor.getSaldoAhorros());

        nestor.retiro(300, "ahorros");
        System.out.println(nestor.getSaldoAhorros());

        nestor.verSaldo();
        nestor.retiro(50, "corriente");
        nestor.verSaldo();

    }
}
