package chapter05;

public class Practice0203 {
    public static void main(String[] args) {
        String title = "Nice to meet you";
        String address = "abc@gmail.com";
        String text = "hello,abc!";
        email(title,address,text);

        System.out.println("---------");
        email(address,text);
    }

    public static void email(String title, String address, String text) {
        System.out.printf("%s に以下のメールを送信しました。\n件名：%s\n本文：%s" ,address,title,text);
    }

    public static void email(String address, String text) {
        System.out.printf("%s に以下のメールを送信しました。\n件名：無題\n本文：%s" ,address,text);
    }





}
