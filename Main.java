import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        calculadora c = new calculadora();
        Scanner sc = new Scanner(System.in);

        int r;
        do {
            System.out.println("Escolha uma opção: " +
                "\n 1- Somar" +
                "\n 2- Subtrair" +
                "\n 3- Dividir" +
                "\n 4- Multiplicar");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    int n1, n2;
                    System.out.println("Número 1: ");
                    n1 = sc.nextInt();
                    System.out.println("Número 2: ");
                    n2 = sc.nextInt();
                    c.somar(n1, n2);
                    break;

                case 2:
                    System.out.println("Número 1: ");
                    n1 = sc.nextInt();
                    System.out.println("Número 2: ");
                    n2 = sc.nextInt();
                    c.subtrair(n1, n2);
                    break;

                case 3:
                    System.out.println("Número 1: ");
                    n1 = sc.nextInt();
                    System.out.println("Número 2: ");
                    n2 = sc.nextInt();
                    c.dividir(n1, n2);
                    break;

                case 4:
                    System.out.println("Número 1: ");
                    n1 = sc.nextInt();
                    System.out.println("Número 2: ");
                    n2 = sc.nextInt();
                    c.multiplicar(n1, n2);
                    break;
            }
            System.out.println("Para ver novamente, digite 0");
            r = sc.nextInt();
        }   while(r==0);
    }
}