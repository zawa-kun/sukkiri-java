package chapter02;
import java.util.Scanner;
import java.util.Random;

public class Practice03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ようこそ占いの館へ");
        System.out.print("あなたの名前を入力してください>");
        String name = sc.nextLine();
        System.out.print("貴方の年齢を入力してください>");
        int age = Integer.parseInt(sc.nextLine());

        // 占いロジック
        int fortune = new Random().nextInt(3);
        fortune++;

        // 出力
        System.out.println(age+"歳の"+name+"さん、あなたの運気番号は"+fortune+"です");
        System.out.println("1:大吉 2:中吉 3:吉 4:凶");
    }

}
