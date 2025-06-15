public class Main {
    public static void main(String[] args) {
        int quantidadeAlgoritmos = 4;

        SortAlgorithm[] algoritmos = new SortAlgorithm[quantidadeAlgoritmos];
        String[] nomes = new String[quantidadeAlgoritmos];

        algoritmos[0] = new SelectionSort();
        nomes[0] = "SelectionSort";

        algoritmos[1] = new MergeSort();
        nomes[1] = "MergeSort";

        algoritmos[2] = new QuickSort();
        nomes[2] = "QuickSort";

        algoritmos[3] = new GnomeSort();
        nomes[3] = "GnomeSort";

        BenchmarkRunner runner = new BenchmarkRunner(algoritmos, nomes, quantidadeAlgoritmos);
        runner.executar();
    }
}
