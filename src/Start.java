import java.io.IOException;

public class Start {


    public static void main (String[] args) throws IOException {

       char ch, answer = 'B';

       System.out.println("Какую букву я загадал ?");
       System.out.print("Попытаетесь ее отгадать: ");

       ch = (char)System.in.read();


       if (ch == answer) {
           System.out.print("Поздравляю! ");
       } else if (ch > answer) {
           System.out.print("Перестарался ! ");
       } else System.out.print("Недостарался ! ");

    }
}
