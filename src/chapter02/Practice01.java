package chapter02;

public class Practice01 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        // String ans = "x+yは"+x+y; // 修正前
        // +は左から右に評価していくため、x+yの演算の優先度を上げるために（）で囲んだ
        String ans = "x+yは"+(x+y);
        System.out.println(ans);
    }

}
