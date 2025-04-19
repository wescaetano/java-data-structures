package application;

public class Program {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for(int i=0; i<10; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.println(vetor[i]);
        }


        // Complexidade do algoritmo Bubble sort O(N^2)
        // Assim sendo um algortimo pouco eficiente
        int troca;
        for(int i=0; i<vetor.length; i++){
            for(int j= i+1; j< vetor.length; j++){
                if(vetor[i] > vetor[j]){
                    troca = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = troca;
                }
            }
        }

        System.out.println("\nVetor ordenado: ");
        for(int i=0; i<10; i++){
            System.out.println(vetor[i]);
        }
    }
}
