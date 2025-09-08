import java.util.Scanner;;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um número para acessar o cálculo respectivo");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int codigo = sc.nextInt();

        System.out.println("Digite o primeiro número");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = sc.nextInt();

        switch (codigo) {
            case 1:
                int resultado = num1 + num2;
                System.out.println("Resultado da soma: " + resultado);
                break;
            case 2:
                int subtracao = num1 - num2;
                System.out.println("Resultado da subtração: " + subtracao);
                break;
            case 3:
                
                break;
            case 4:
                if (num2 != 0) {
                    double resultadoDivisao = (double) num1 / num2;
                    System.out.println("Resultado da divisão: " + resultadoDivisao);
                } else {
                    System.out.println("Divisão por zero não é permitida!");
                }
                break;
            default:
                System.out.println("Código inválido!");
                break;
        }

        //teste sem 

    }
}
