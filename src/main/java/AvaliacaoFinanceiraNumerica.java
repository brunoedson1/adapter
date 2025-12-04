public class AvaliacaoFinanceiraNumerica implements IAvaliacaoFinanceira {

    private double saldo;

    public AvaliacaoFinanceiraNumerica(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String getResultado() {
        return "Saldo numérico: " + saldo;
    }

    @Override
    public double getValor() {
        return saldo;
    }
}