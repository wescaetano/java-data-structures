package application;

public class Program {
    public static void main(String[] args) {
        int[] vet = new int[10];

        System.out.println("Vetor desordenado: ");
        for(int i=0; i<vet.length; i++){
            vet[i] = (int) (Math.random() * vet.length);
            System.out.println(vet[i]);
        }


        // Complexidade O(N^2)
        int posicaoMenor, aux;
        for(int i=0; i<vet.length; i++){
             posicaoMenor= i;
            for(int j=i+1; j< vet.length; j++){
                if (vet[j] < vet[posicaoMenor]){
                    posicaoMenor = j;
                }
            }
            aux = vet[posicaoMenor];
            vet[posicaoMenor] = vet[i];
            vet[i] = aux;
        }

        System.out.println("\n\nVetor Ordenado: ");
        for(int i=0; i<vet.length; i++){
            System.out.println(vet[i]);
        }
    }
}
