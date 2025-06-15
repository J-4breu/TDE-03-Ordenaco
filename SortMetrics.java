public class SortMetrics {
    private final long tempoNano;
    private final long trocas;
    private final long iteracoes;

    public SortMetrics(long tempoNano, long trocas, long iteracoes) {
        this.tempoNano = tempoNano;
        this.trocas = trocas;
        this.iteracoes = iteracoes;
    }

    public long getTempoNano() {
        return tempoNano;
    }

    public long getTrocas() {
        return trocas;
    }

    public long getIteracoes() {
        return iteracoes;
    }

    @Override
    public String toString() {
        double tempoMs = tempoNano / 1_000_000.0;
        return "Tempo: " + tempoMs + " ms | Trocas: " + trocas + " | Iterações: " + iteracoes;
    }
}
