public class GnomeSort implements SortAlgorithm {

    @Override
    public SortMetrics sort(int[] arr) {
        long trocas = 0;
        long iteracoes = 0;
        long inicio = System.nanoTime();

        int n = calcularTamanho(arr);
        int i = 0;

        while (i < n) {
            iteracoes++;
            if (i == 0 || arr[i] >= arr[i - 1]) {
                i++;
            } else {
                trocar(arr, i, i - 1);
                trocas++;
                i--;
            }
        }

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
        } 
        catch (ArrayIndexOutOfBoundsException e) {
        }
        return n;
    }

    private void trocar(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
