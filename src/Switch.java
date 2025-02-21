import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");     // Switch используем вместо много условий If
        int age = scanner.nextInt();
        switch(age){
            case 0 :
                System.out.println("ты родился");
                break;
            case 7 :
                System.out.println("ты пошел в школу");
                break;
            case 18 :
                System.out.println("ты зокончил школу");
                break;
            default:    // если хотим закончить Switch
                System.out.println("ни одно из условий не подошло");
        }
    }
}
