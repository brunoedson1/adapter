import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvaliacaoFinanceiraAdapterTest {

    @Test
    void deveRetornarSuperavitQuandoSaldoPositivo() {
        AvaliacaoFinanceiraNumerica avaliacaoNumerica = new AvaliacaoFinanceiraNumerica(1500.0);
        IAvaliacaoFinanceira adapter = new AvaliacaoFinanceiraAdapter(avaliacaoNumerica);

        assertEquals("SUPERÁVIT", adapter.getResultado());
        assertEquals(1500.0, adapter.getValor());
    }

    @Test
    void deveRetornarDeficitQuandoSaldoNegativo() {
        AvaliacaoFinanceiraNumerica avaliacaoNumerica = new AvaliacaoFinanceiraNumerica(-500.0);
        IAvaliacaoFinanceira adapter = new AvaliacaoFinanceiraAdapter(avaliacaoNumerica);

        assertEquals("DÉFICIT", adapter.getResultado());
        assertEquals(-500.0, adapter.getValor());
    }

    @Test
    void deveRetornarEquilibradoQuandoSaldoZero() {
        AvaliacaoFinanceiraNumerica avaliacaoNumerica = new AvaliacaoFinanceiraNumerica(0.0);
        IAvaliacaoFinanceira adapter = new AvaliacaoFinanceiraAdapter(avaliacaoNumerica);

        assertEquals("EQUILIBRADO", adapter.getResultado());
        assertEquals(0.0, adapter.getValor());
    }
}