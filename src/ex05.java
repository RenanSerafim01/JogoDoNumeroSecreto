import java.util.Scanner;

public class ex05 {

    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        int [] vetorA =numeros();

        ordenar(vetorA);

        //exibir vetorA

        System.out.println("Números Ordenados");
        for (int i=0;i<5;i++){
            System.out.println(vetorA[i]);
        }

    }

    public static int [] numeros(){

        int [] vetorA = new int [5];

        for (int i=0;i<5;i++){
            System.out.println("Digite um número:");
            vetorA[i]=entrada.nextInt();
        }

        return vetorA;

    }

    public static int[] ordenar(int [] vetorA){

        int aux=0;

        for(int i=0;i<5;i++){

            for (int j=0;j<4;j++){

                if (vetorA[j]>vetorA[j+1]){
                    aux=vetorA[j];
                    vetorA[j]=vetorA[j+1];
                    vetorA[j+1]=aux;
                }
            }
        }


        return vetorA;

    }


}
