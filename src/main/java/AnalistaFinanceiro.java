public class AnalistaFinanceiro {

    private IAvaliacaoFinanceira avaliacao;

    public AnalistaFinanceiro(IAvaliacaoFinanceira avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String obterSituacaoFinanceira() {
        return avaliacao.getResultado();
    }
}