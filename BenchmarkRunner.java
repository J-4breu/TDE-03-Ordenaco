public class BenchmarkRunner {

    private final SortAlgorithm[] algoritmos;
    private final String[] nomesAlgoritmos;
    private final int quantidadeAlgoritmos;
    private final int[] tamanhosVetores = {1000, 10000, 100000, 500000, 1000000};
    private final int rodadasPorTamanho = 5;

    public BenchmarkRunner(SortAlgorithm[] algoritmos, String[] nomesAlgoritmos, int quantidadeAlgoritmos) {
        this.algoritmos = algoritmos;
        this.nomesAlgoritmos = nomesAlgoritmos;
        this.quantidadeAlgoritmos = quantidadeAlgoritmos;
    }

    public void executar() {
        System.out.println("==== BENCHMARK DE ALGORITMOS DE ORDENAÇÃO ====");

        for (int idxTamanho = 0; idxTamanho < tamanhosVetores.length; idxTamanho++) {
            int tamanho = tamanhosVetores[idxTamanho];
            System.out.println("\n>> Tamanho do vetor: " + tamanho);

            for (int i = 0; i < quantidadeAlgoritmos; i++) {
                SortAlgorithm algoritmo = algoritmos[i];
                String nome = nomesAlgoritmos[i];

                if ((nome.equals("SelectionSort") || nome.equals("GnomeSort")) && tamanho > 10000) {
                    System.out.println("  " + nome + "         | Ignorado para n > 10.000");
                    continue;
                }

                long somaTempo = 0;
                long somaTrocas = 0;
                long somaIteracoes = 0;

                for (int rodada = 0; rodada < rodadasPorTamanho; rodada++) {
                    long seed = tamanho * 100L + rodada;
                    int[] vetorOriginal = RandomDataGenerator.gerarVetorAleatorio(tamanho, seed);
                    int[] vetorCopia = new int[tamanho];

                    for (int j = 0; j < tamanho; j++) {
                        vetorCopia[j] = vetorOriginal[j];
                    }

                    SortMetrics metrics = algoritmo.sort(vetorCopia);
                    somaTempo += metrics.getTempoNano();
                    somaTrocas += metrics.getTrocas();
                    somaIteracoes += metrics.getIteracoes();
                }

                double mediaTempoMs = somaTempo / (1_000_000.0 * rodadasPorTamanho);
                long mediaTrocas = somaTrocas / rodadasPorTamanho;
                long mediaIteracoes = somaIteracoes / rodadasPorTamanho;

                System.out.println("  " + nome + "         | Tempo médio: " + mediaTempoMs + " ms | Trocas: " + mediaTrocas + " | Iterações: " + mediaIteracoes);
            }
        }
    }
}
