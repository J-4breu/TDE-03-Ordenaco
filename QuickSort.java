public class QuickSort implements SortAlgorithm {

    private long trocas;
    private long iteracoes;

    private int calcularTamanho(int[] arr) {
        int n = 0;
        try {
            while (true) {
                int temp = arr[n];
                n++;
            }
        } 
        catch (ArrayIndexOutOfBoundsException e) {
        }
        return n;
    }
    
    @Override
    public SortMetrics sort(int[] arr) {
        trocas = 0;
        iteracoes = 0;
        long inicio = System.nanoTime();

        int n = calcularTamanho(arr);

        quickSort(arr, 0, n - 1);

        long fim = System.nanoTime();
        return new SortMetrics(fim - inicio, trocas, iteracoes);
    }


    private void quickSort(int[] arr, int baixo, int alto) {
        if (baixo < alto) {
            int pi = particionar(arr, baixo, alto);
            quickSort(arr, baixo, pi - 1);
            quickSort(arr, pi + 1, alto);
        }
    }

    private int particionar(int[] arr, int baixo, int alto) {
        int pivo = arr[alto];
        int i = baixo - 1;
        for (int j = baixo; j < alto; j++) {
            iteracoes++;
            if (arr[j] <= pivo) {
                i++;
                trocar(arr, i, j);
                trocas++;
            }
        }
        trocar(arr, i + 1, alto);
        trocas++;
        return i + 1;
    }

    private void trocar(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
