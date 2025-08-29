import java.util.Scanner;;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um número para acessar o cálculo respectivo");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Adição");
        System.out.println("4 - Divisão");
        int codigo = sc.nextInt();

        System.out.println("Digite o primeiro número");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = sc.nextInt();

        if ( codigo == 1){

        int num3 =  num1 + num2;

        System.out.println("Soma: " + num3);

        }


    }
}
