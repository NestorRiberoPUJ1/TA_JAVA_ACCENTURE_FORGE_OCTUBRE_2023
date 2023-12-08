package cuentaBanco;

import java.util.ArrayList;

public class BankAccount {

    private static ArrayList<BankAccount> totalCuentas = new ArrayList<BankAccount>();
    private static double dinero = 0;

    protected String cuenta;
    protected double saldoAhorros;
    protected double saldoCorriente;

    public BankAccount(double saldoAhorros, double saldoCorriente) {
        this.cuenta = cuentaAleatoria();
        this.saldoAhorros = saldoAhorros;
        this.saldoCorriente = saldoCorriente;

        totalCuentas.add(this);
        dinero += saldoAhorros + saldoCorriente;
    }

    public void deposito(double valor ,String cuenta){
        if(cuenta =="ahorros"){
            this.saldoAhorros+=valor;
            dinero+=valor;
        }
        else if(cuenta=="corriente"){
            this.saldoCorriente+=valor;
             dinero+=valor;
        }

    }

    private static String cuentaAleatoria() {
        String aleatorio = "";
        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * 9);

            aleatorio += rand;
        }
        return aleatorio;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldoAhorros() {
        return saldoAhorros;
    }

    public void setSaldoAhorros(double saldoAhorros) {
        this.saldoAhorros = saldoAhorros;
    }

    public double getSaldoCorriente() {
        return saldoCorriente;
    }

    public void setSaldoCorriente(double saldoCorriente) {
        this.saldoCorriente = saldoCorriente;
    }

    public static ArrayList<BankAccount> getTotalCuentas() {
        return totalCuentas;
    }

    public static void setTotalCuentas(ArrayList<BankAccount> totalCuentas) {
        BankAccount.totalCuentas = totalCuentas;
    }

    public static double getDinero() {
        return dinero;
    }

    public static void setDinero(double dinero) {
        BankAccount.dinero = dinero;
    }

}
