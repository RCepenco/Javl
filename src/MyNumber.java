import java.util.Scanner;

class MyNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println(inp.nextInt() + inp.nextInt());
        inp.close();
    }
}