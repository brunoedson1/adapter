public class AvaliacaoFinanceiraAdapter implements IAvaliacaoFinanceira {

    private AvaliacaoFinanceiraNumerica avaliacaoNumerica;
    private AvaliacaoFinanceiraConceito avaliacaoConceito;

    public AvaliacaoFinanceiraAdapter(AvaliacaoFinanceiraNumerica avaliacaoNumerica) {
        this.avaliacaoNumerica = avaliacaoNumerica;
        this.avaliacaoConceito = converterParaConceito(avaliacaoNumerica.getValor());
    }

    private AvaliacaoFinanceiraConceito converterParaConceito(double saldo) {
        String conceito;
        if (saldo > 0) {
            conceito = "SUPERÁVIT";
        } else if (saldo < 0) {
            conceito = "DÉFICIT";
        } else {
            conceito = "EQUILIBRADO";
        }
        return new AvaliacaoFinanceiraConceito(conceito);
    }

    @Override
    public String getResultado() {
        return avaliacaoConceito.getConceito();
    }

    @Override
    public double getValor() {
        return avaliacaoNumerica.getValor();
    }
}
