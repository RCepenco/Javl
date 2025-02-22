
import java.util.Scanner;

class MyNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double n = 3;
        double mean = (x1 + x2 + x3)/n;

        System.out.println(mean);
        sc.close();
    }
}