public abstract class Conta {
private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract double sacar(double valor);
    public abstract double depostar(double valor);
    public abstract void obterSaldo();
}
