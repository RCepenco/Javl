import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //noinspection InfiniteLoopStatement
        while (true) {
            int t = scanner.nextInt();
            String word = getWordForm(t);
            System.out.println("Температура воздуха сегодня: " + t + " " + word);
        }
    }

    public static String getWordForm(int value) {
        value = Math.abs(value) % 100;
        if (value >= 11 && value <= 19) return "градусов";

        value = value % 10;
        if (value == 1) return "градус";
        if (value >= 2 && value <= 4) return "градуса";
        return "градусов";
    }
}
