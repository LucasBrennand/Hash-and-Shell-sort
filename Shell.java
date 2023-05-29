package br.unicap.ed2;

public class Shell {
    private int[] vetor;
    private int[] h;
    public Shell(int[] vetor, int[] h) {
        this.vetor = vetor;
        this.h = h;
    }
    public void sort() {
        int n = getVetor().length;
        for (int z = n / 2; z > 0; z /= 2) {
            for (int i = z; i < n; i += 1) {
                int temp = getVetor()[i];
                int j;
                for (j = i; j >= z && getVetor()[j - z] > temp; j -= z)
                    getVetor()[j] = getVetor()[j - z];
                getVetor()[j] = temp;
            }
        }
    }
    public int[] getVetor() {
        return vetor;
    }
}
