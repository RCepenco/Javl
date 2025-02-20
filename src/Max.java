import java.util.Scanner;
public class Max
     {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();  // если int (integer) вместо String то Input можно только цифры

            System.out.println("Температура воздуха сегодня: " + t + " градусов.");
            scanner.close();
        }
     }





