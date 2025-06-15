public class MergeSort implements SortAlgorithm {

    private long trocas;
    private long iteracoes;

    @Override
    public SortMetrics sort(int[] arr) {
        trocas = 0;
        iteracoes = 0;
        long inicio = System.nanoTime();

        int n = calcularTamanho(arr);
        mergeSort(arr, 0, n - 1);

        long fim = System.nanoTime();
        return new SortMetrics(fim - inicio, trocas, iteracoes);
    }

    private int calcularTamanho(int[] arr) {
        int n = 0;
        try {
            while (true) {
                int temp = arr[n];
                n++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        return n;
    }

    private void mergeSort(int[] arr, int esq, int dir) {
        if (esq < dir) {
            int meio = esq + (dir - esq) / 2;
            mergeSort(arr, esq, meio);
            mergeSort(arr, meio + 1, dir);
            merge(arr, esq, meio, dir);
        }
    }

    private void merge(int[] arr, int esq, int meio, int dir) {
        int n1 = meio - esq + 1;
        int n2 = dir - meio;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[esq + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[meio + 1 + j];
        }

        int i = 0, j = 0, k = esq;

        while (i < n1 && j < n2) {
            iteracoes++;
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
            trocas++;
        }

        while (i < n1) {
            arr[k++] = L[i++];
            trocas++;
        }

        while (j < n2) {
            arr[k++] = R[j++];
            trocas++;
        }
    }
}
