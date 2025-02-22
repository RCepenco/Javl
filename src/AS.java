import java.util.Scanner;

class DeveloperBudget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод бюджета и зарплаты одного разработчика
        System.out.print("Введите месячный бюджет компании (X): ");
        int budget = scanner.nextInt();

        System.out.print("Введите зарплату одного разработчика (Y): ");
        int salary = scanner.nextInt();

        // Вычисление максимального количества разработчиков и оставшегося бюджета
        int maxDevelopers = budget / salary; // Целочисленное деление
        int remainingBudget = budget % salary; // Остаток от деления

        // Вывод результата
        System.out.println(maxDevelopers + " " + remainingBudget);

        scanner.close(); // Закрытие сканера
    }
}
