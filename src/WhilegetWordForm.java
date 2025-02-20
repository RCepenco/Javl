import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.print("Введите температуру (или 'exit' для выхода): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                isRunning = false;
                continue;
            }

            try {
                int temperature = Integer.parseInt(input);
                String word = getWordForm(temperature);
                System.out.println("Температура воздуха сегодня: " + temperature + " " + word);
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, введите число или 'exit' для выхода");
            }
        }

        scanner.close();
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
