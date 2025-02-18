import java.io.IOException;

public class Third {

    public static void main (String[] args) throws IOException {
    int count = 0;

        while (count < 10) {

            count++;
            if((count%2) != 0 ) continue;
            System.out.println(count);
        };

    }











}
