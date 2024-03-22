public class calculadora {

    float total;
    public void somar(int n1, int n2) {
        total = n1+n2;
        System.out.println(total);
    }
    public void subtrair(int n1, int n2) {
        total = n1-n2;
        System.out.println(total);
    }
    public void dividir(int n1, int n2) {
        total = (float) n1 /n2;
        System.out.printf("%.2f \n", total);
    }
    public void multiplicar(int n1, int n2) {
        total = n1*n2;
        System.out.println(total);
    }
}
