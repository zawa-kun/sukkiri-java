package chapter03;
import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("[menu] 1:search 2:register 3:delete 4:update > ");
        int selected = sc.nextInt();

        switch(selected) {
            case 1:
                System.out.println("searching");
                break;
            case 2:
                System.out.println("registering");
                break;
            case 3:
                System.out.println("deleting");
                break;
            case 4:
                System.out.println("changing");
                break;
        }
    }
}
