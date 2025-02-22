
import java.util.Scanner;

class MyNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int square = n * n;
        int cube = n * n * n;

        System.out.println(n +" "+ square +" "+ cube);


        sc.close();
    }
}