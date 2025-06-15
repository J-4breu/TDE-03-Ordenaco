import java.util.Random;

public class RandomDataGenerator {

    public static int[] gerarVetorAleatorio(int tamanho, long seed) {
        Random rand = new Random(seed);
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = rand.nextInt(1_000_001); // de 0 a 1.000.000
        }
        return vetor;
    }
}
