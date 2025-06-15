# Benchmark de Algoritmos de Ordenação  

Este projeto tem como objetivo analisar e comparar o desempenho de quatro algoritmos de ordenação — **Selection Sort**, **Merge Sort**, **Quick Sort** e **Gnome Sort** — aplicados a vetores de inteiros de diferentes tamanhos, com foco nas seguintes métricas:

- Tempo médio de execução (ms)
- Número de trocas
- Número de iterações  

---

## 📊 Metodologia  

Para a análise comparativa, foram gerados vetores de inteiros com os seguintes tamanhos:

   1.000  
   10.000  
   100.000  
   500.000  
   1.000.000  

- Cada experimento foi executado **5 vezes**, com **conjuntos distintos de dados** gerados aleatoriamente utilizando **seed fixa** para garantir reprodutibilidade.
- Para cada vetor, foram registrados:
  - O **tempo médio de execução** (em milissegundos)
  - O **número total de trocas realizadas**
  - O **número total de iterações (comparações internas)**  

---

## 📁 Estrutura do Projeto  

├── Main.java # **Ponto de entrada do programa**  
<br>
<br>
├── BenchmarkRunner.java # **Lógica de medição e execução de testes**  

├── RandomDataGenerator.java # **Geração de vetores aleatórios com seed**  

├── SortAlgorithm.java # **Interface comum para os algoritmos**  

├── SortMetrics.java # **Classe para armazenar métricas: tempo, trocas e iterações**  
<br>
<br>
├── SelectionSort.java # **Implementação do Selection Sort**  

├── MergeSort.java # **Implementação do Merge Sort**  

├── QuickSort.java # **Implementação do Quick Sort**  

└── GnomeSort.java # **Implementação do Gnome Sort**  

---

## 🧠 Algoritmos de Ordenação Utilizados  

### 🔹 Selection Sort
O Selection Sort é um algoritmo de ordenação simples e intuitivo. Ele percorre o vetor buscando o menor elemento e o coloca na primeira posição. Em seguida, repete o processo para a segunda posição, e assim por diante, até o final do vetor.

- **Complexidade Temporal:** O(n²) no pior, médio e melhor caso.

- **Trocas:** Relativamente poucas, pois cada iteração realiza no máximo uma troca.

- **Indicado para:** Pequenos conjuntos de dados onde simplicidade é mais relevante que desempenho.

### 🔹 Merge Sort
O Merge Sort segue a estratégia de divisão e conquista. Ele divide recursivamente o vetor em duas metades, ordena cada metade e depois as mescla em um vetor final ordenado.

- **Complexidade Temporal:** O(n log n) em todos os casos.

- **Trocas:** Envolve operações de cópia e junção de vetores, que podem ser custosas em memória.

- **Vantagens:** Estável e muito eficiente mesmo em grandes volumes de dados.

- **Desvantagens:** Requer espaço auxiliar proporcional ao tamanho do vetor.

### 🔹 Quick Sort
O Quick Sort também utiliza a técnica de divisão e conquista, escolhendo um pivô e reorganizando o vetor de modo que os menores valores fiquem à esquerda do pivô e os maiores à direita. O processo é repetido recursivamente em cada partição.

- **Complexidade Temporal:**

     Média: O(n log n)
    
     Pior caso: O(n²) (ocorre quando os dados já estão ordenados e o pivô é mal escolhido)
    
- **Trocas:** Mais eficiente em trocas que o Merge Sort.

- **Vantagens:** Muito rápido na prática com boas escolhas de pivô.

- **Desvantagens:** Não é estável e depende da estratégia de particionamento.

### 🔹 Gnome Sort
O Gnome Sort funciona de forma semelhante ao Insertion Sort, mas com uma abordagem diferente: ele compara elementos adjacentes e, se estiverem fora de ordem, troca-os e volta uma posição. Caso contrário, avança uma posição.

- **Complexidade Temporal:** O(n²) no pior e médio caso.

- **Trocas:** Número elevado de trocas, especialmente em vetores desordenados.

- **Vantagens:** Fácil de implementar e entender.

- **Desvantagens:** Pouco eficiente para conjuntos grandes de dados.  

---

## 📈Resultados e Gráficos  

Os dados foram organizados em tabelas e gráficos comparativos.

### Tempo Médio de Execução

![image](https://github.com/user-attachments/assets/88acbbfe-5e61-4e6f-a3d0-4b6c7f146483)

![image](https://github.com/user-attachments/assets/f6f1214c-fe18-468f-ab81-8e1756622916)

### Número de Trocas

![image](https://github.com/user-attachments/assets/da9a3dc0-a4c1-4686-b949-68c0c7cf742c)

![image](https://github.com/user-attachments/assets/a104f0ff-f699-4cbc-9ec7-580dc69af72b)

### Número de Iterações  

![image](https://github.com/user-attachments/assets/b58500b1-1714-4b6f-a4b2-53887cf44901)

![image](https://github.com/user-attachments/assets/14ba2522-4ca7-464c-b917-b67e8ae225f1)

---

## 🎥 Vídeo de Apresentação  

Explicação completa do projeto, código-fonte e análise dos resultados:

📎 [Inserir link do vídeo aqui]
