import java.util.Scanner;

class MyNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int maxDevelopers = x / y;
        int remainingBudget = x % y;
        System.out.println(maxDevelopers + " " + remainingBudget);
        scanner.close();
    }
}