import java.util.Scanner;

public class ex06 {

    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        String [] produtos = new String[]{"Notebook","Computadores","Tablets","Servidores"};
        int [] metaVenda = new int []{100,150,200,250};

        //CHAMADOS
        //A
        int [][] vendas = entrada(produtos);

        //B
        int [] vendasLinha = verificaLinha(vendas);

        //C
        int [] vendasTrimestre = verificaTrimestre(vendas);

        //D
        String [] statusMeta = verificaMeta(vendasLinha, metaVenda);


        System.out.println("\n--- RELATÓRIO DE VENDAS POR PRODUTO ---");
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("\nProduto: " +produtos[i]);
            System.out.println("Meta de Vendas: " +metaVenda[i]);
            System.out.println("TotalVendido: " +vendasLinha[i]);
            System.out.println("Status: " + statusMeta[i]);
        }

        System.out.println("\n--- RELATÓRIO DE VENDAS POR TRIMESTRE ---");
        for (int i = 0; i < vendasTrimestre.length; i++){
            System.out.println("Total de vendas no " + (i+1) + "º Trimestre: " + vendasTrimestre[i] + " unidades.");
        }

    }

    //A
    public static int [][] entrada (String [] produtos){

        int qtdProdutos = produtos.length;
        int [][] vendas = new int[qtdProdutos][3];

        for (int i = 0; i < qtdProdutos; i++) {
            System.out.println("-Para o produto: "+produtos[i]);
            for (int j = 0; j < 3; j++) {
                System.out.println("  Digite as vendas do " + (j + 1) + "º trimestre: ");
                vendas[i][j] = entrada.nextInt();
            }
        }

        return vendas;
    }//A

    public static int [] verificaLinha (int [][] vendas){

        int [] vendasLinha = new int [4];

        for (int i = 0; i < 4; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 3; j++) {

                somaLinha += vendas[i][j];
            }
            vendasLinha[i] = somaLinha;
        }

        return vendasLinha;

    }

    public static int []  verificaTrimestre (int [][] vendas){

        int [] vendasTrimestre = new int [3];

        for (int j = 0; j < 3; j++) {
            int somaTrimestre = 0;
            for (int i = 0; i < 4; i++) {
                somaTrimestre += vendas[i][j];
            }
            vendasTrimestre[j] = somaTrimestre;
        }

        return vendasTrimestre;
    }

    public static String [] verificaMeta (int[]totalVendas , int[]metas){

        String [] statusMeta = new String[totalVendas.length];

        for (int i = 0; i < totalVendas.length; i++) {
            if (totalVendas[i] >= metas[i]) {
                statusMeta[i] = "Atingiu Meta";
            }else {
                statusMeta[i] = "Nao Atingiu Meta";
            }
        }

        return statusMeta;

    }
    
}
