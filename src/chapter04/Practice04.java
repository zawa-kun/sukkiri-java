package chapter04;
import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {3, 4, 9};
        System.out.println("一桁の数字を入力してください");
        int input = sc.nextInt();

        for(int num: numbers) {
            if (num == input) {
                System.out.println("アタリ");
                break;
            }
        }
    }

}
