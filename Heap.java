package br.unicap.ed2;

public class Heap {
    private static int[] vetor;
    private static int tam;

    public Heap(int[] vetor) {
        this.vetor = vetor;
    }
    public void sort() {
        vetor = getVetor();
        tam = vetor.length - 1;
        constroiHeap();
        for (int i = tam; i > 0; i--) {
            troca(0, tam);
            tam -= 1;
            maxHeap(0);
        }
    }
    private static void constroiHeap() {
        int meio = (int) (tam/2);
        for (int i = meio - 1; i >= 0; i--) {
            maxHeap(i);
        }
    }
    private static void troca(int i, int j) {
        int aux;
        aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;
    }
    private static void maxHeap(int pai) {
        int maior = pai, esquerda = 2 * pai + 1, direita = 2 * pai + 2;
        if (esquerda <= tam && vetor[esquerda] > vetor[maior])
            maior = esquerda;
        if (direita <= tam && vetor[direita] > vetor[maior])
            maior = direita;
        if (maior != pai) {
            troca(pai, maior);
            maxHeap(maior);
        }
    }
    public static int[] getVetor() {
        return vetor;
    }
}
