import java.util.Scanner;

public class ex03 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        String [] nomes = new String[4];
        int [] tempo = new int[4];
        double [] salario = new double[4];

        for (int i=0;i<4;i++){
            System.out.println("Digite o nome:");
            nomes[i]= entrada.next();
            System.out.println("Digite o tempo:");
            tempo[i]= entrada.nextInt();
            System.out.println("Digite o salário:");
            salario[i]= entrada.nextDouble();
        }

        //chamada de metodo
        String [] analise =verifica(tempo, salario);//reais

        relatorio(nomes,analise);


    }
    //Métodos
    //função com retorno
    public static String [] verifica(int [] tempo, double [] salario){

        String [] analise = new String[4];

        for (int i=0;i<4;i++){
            if (salario[i]<700 || tempo[i]>3) {
                analise[i]="Tem reajuste";
            }else{
                analise[i]="Não tem reajuste";
            }
        }

        return analise;
    }


    public static void relatorio(String [] nomes, String [] analise){

        System.out.println("Relatório RH");

        for (int i=0;i<4;i++){
            System.out.println("Nome "+nomes[i]+" - "+analise[i]);
        }

    }

}
