import java.util.Scanner;

public class ex01 {

    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        String nome;
        int tipo=0,qtd=0;

            System.out.println("Digite o seu nome:");
            nome= entrada.next();

            System.out.println("1 - Standard");
            System.out.println("2 - Luxo");
            System.out.println("3 - Super Luxo");

            System.out.println("Digite a opção de tipo:");
            tipo =entrada.nextInt();

            System.out.println("Digite a quantidade de dias:");
            qtd= entrada.nextInt();


            double valor=calcularEstadia(tipo,qtd);
            System.out.println("Valor da Estadia: ");

            pagamento(valor);
    }

    public static double calcularEstadia(int tipo,int qtd){

        double valor=0;

        if (tipo == 1){
            valor=380*qtd;
        } else if (tipo == 2) {
            valor=450*qtd;
        } else if (tipo == 3) {
            valor=560*qtd;
        }

        return valor;
    }

    public static void pagamento(double valor) {

        double valorDesconto = 0;
        char pagamento;
        System.out.println("V - à vista");
        System.out.println("P - a prazo");

        System.out.println("Digite a forma de pagamento:");
        pagamento = entrada.next().charAt(0);

        if (pagamento == 'V') {
            valor = valor * 0.9;
            System.out.println("Valor da estadia ao pagar à vista - " + valor);
        }
    }

}
