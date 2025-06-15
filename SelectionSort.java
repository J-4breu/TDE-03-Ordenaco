public class SelectionSort implements SortAlgorithm {

    @Override
    public SortMetrics sort(int[] arr) {
        long trocas = 0;
        long iteracoes = 0;
        long inicio = System.nanoTime();

        int n = 0;
        while (true) {
            try {
                int temp = arr[n];
                n++;
            } catch (ArrayIndexOutOfBoundsException e) {
                break;
            }
        }

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                iteracoes++;
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                trocar(arr, i, minIndex);
                trocas++;
            }
        }

        long fim = System.nanoTime();
        return new SortMetrics(fim - inicio, trocas, iteracoes);
    }

    private void trocar(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
