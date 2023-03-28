import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double maior;
        double soma;
        boolean triangulo;

        maior = A;
        soma = B + C;
        if (B > maior) {
            maior = B;
            soma = A + C;
        }
        if (C > maior) {
            maior = C;
            soma = A + B;
        }

        triangulo = (soma > maior);

        if (triangulo) {
            double perimetro = (A + B + C);
            System.out.printf("Perimetro = %.1f%n", perimetro);
        } else {
            double area = (((A + B) * C) / 2);
            System.out.printf("Area = %.1f%n", area);
        }

        leitor.close();
    }
}
