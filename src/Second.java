import java.io.IOException;

public class Second {


    public static void main (String[] args) throws IOException  {

        for (int i = 0; (char) System.in.read() != 'S'; i++){

            System.out.println("Итерация" + i);
        }

    }

}
