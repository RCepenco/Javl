import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

       /* System.out.println("Введи 5");      // У этой програмы while есть недостаток
        int value = scanner.nextInt();         // мы повторяемся в коде "Введи 5", в хорошей програме не
        while (value!=5) {                   // должно быть дублирование кода. Эту проблему решаем с "DoWhile"
            System.out.println("Введи 5");
            value = scanner.nextInt();
        }
        System.out.println("Вы ввели 5");*/
        Scanner scanner = new Scanner(System.in);
        int value ;
        do {
            System.out.println("Введи 5");
            value = scanner.nextInt();
        } while (value!=5);
        System.out.println("Вы ввели 5");
    }

}
