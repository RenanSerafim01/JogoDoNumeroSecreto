import java.util.Scanner;

public class ex04 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        //chamada A)
        int [][] chamados = carregar();

        //chamada B)
        relatorioErros(chamados);

        //chamada C)
        int [] qtdCriterios = criterios(chamados);

        System.out.println("Relatório de critérios:");
        for (int i=0;i<4;i++){
            System.out.println("Critério "+(i=1)+":"+qtdCriterios[i]);
        }

    }
    //metodos

    public static int [][] carregar() {

        int [][] chamados = new int[5][3];

        for (int i=0;i<5;i++){
            System.out.println("Digite o id do funcionario:");
            chamados[i][0]= entrada.nextInt();
            System.out.println("Digite o código de erro:");
            chamados[i][1]= entrada.nextInt();

            //validação
            while(chamados[i][1]<1 || chamados [i][1]<3){
                System.out.println("Digite o codigo do erro 1/2/3:");
                chamados[i][1]= entrada.nextInt();
            }
            System.out.println("Digite o critério do chamado:");
            chamados[i][2]= entrada.nextInt();

            //validação
            while (chamados[i][2]<0 || chamados[i][2]<4){
                System.out.println("Digite o critério do chamado 1/2/3/4:");
                chamados[i][2]= entrada.nextInt();
            }

        }

        return chamados;

    }

    public static void relatorioErros(int [][] chamados){

        int [] erros = new int[3];

        for(int i=0;i<5;i++){

            if (chamados[i][1] == 1){
                erros[0]++;
            } else if (chamados[i][1] == 2) {
                erros[1]++;
            }else{
                erros[0]++;
            }
        }

        System.out.println("Relatório de Erros");
        for (int i=0;i<3;i++){
            System.out.println("Erro "+(i+1)+":"+erros[i]);
        }

    }

    public static int [] criterios(int [][] chamados){

        int [] qtdCriterios = new int[4];

        for (int i=0;i<5;i++){

            switch(chamados[i][2]){
                case 1:
                    qtdCriterios[0]++;
                    break;
                case 2:
                    qtdCriterios[1]++;
                    break;
                case 3:
                    qtdCriterios[2]++;
                    break;
                case 4:
                    qtdCriterios[3]++;
                    break;
            }

        }

        return qtdCriterios;

    }

}
