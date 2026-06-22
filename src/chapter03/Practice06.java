package chapter03;
import java.util.Random;
import java.util.Scanner;

public class Practice06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----number game-----");
        int ans = new Random().nextInt(9);
        for (int i=0; i<5; i++) {
            System.out.println("Please input number of 0-9");
            int num = sc.nextInt();
            if (num == ans) {
                System.out.println("Success");
                break;
            }
            System.out.println("Failure");
        }
        System.out.println("End of the game");
    }

}
