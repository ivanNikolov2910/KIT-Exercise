import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(",");
        final double epsilon = 0.01;
        double r1 = Integer.parseInt(strings[0]);
        double h1 = Integer.parseInt(strings[1]);
        double r2 = Integer.parseInt(strings[2]);
        double h2 = Integer.parseInt(strings[3]);
        double V1 = Math.PI * r1 * r1 * h1;
        double V2 = Math.PI * r2 * r2 * h2;
        if (Math.abs(V1 - V2) < epsilon) {
            System.out.printf("V1 = V2 = %.2f", V1);
        } else if (V1 > V2) {
            System.out.printf("V1 = %.2f", V1);
        } else {
            System.out.printf("V2 = %.2f", V2);
        }
    }
}