package application;

public class Program {
    public static void main(String[] args) {
        int[] vet = new int[10];

        for(int i=0; i<vet.length; i++){
            vet[i] = (int) (Math.random() * vet.length);
            System.out.println(vet[i]);
        }


        int aux;
        for(int i=1; i<vet.length; i++){
            aux = vet[i];
           int j = i-1;
            while(j>=0 && vet[j]>aux){
                vet[j+1] = vet[j];
                j--;
            }
            vet[j+1] = aux;
        }


        // Complexidade O(N^2)
        System.out.println("\n\nVetor ordenado: ");
        for(int i=0; i<vet.length; i++){
            System.out.println(vet[i]);
        }


    }
}
