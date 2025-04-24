package application;

public class Program {
    public static void main(String[] args) {
        int[] vet = new int[10];

        System.out.println("Desordenado:");
        for(int i=0; i<vet.length; i++){
            vet[i] = (int) (Math.random() * vet.length);
            System.out.println(vet[i]);
        }

        int h = 1;
        int n = vet.length;
        while(h < n){
            h = h * 3 + 1;
        }
        h = (int) Math.floor(h/3);

        int elemento, j;
        while(h>0){
            for(int i=h; i<n; i++){
                elemento = vet[i];
                j = i;
                while(j >= h && vet[j - h] > elemento){
                    vet[j] = vet[j - h];
                    j = j - h;
                }
                vet[j] = elemento;
            }
            h = h / 2;
        }

        System.out.println("\n\nVetor ordenado: ");
        for(int i=0; i<vet.length; i++){
            System.out.println(vet[i]);
        }


    }
}
