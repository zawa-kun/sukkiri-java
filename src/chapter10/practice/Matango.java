package chapter10.practice;

public class Matango {
    int hp = 50;
    char suffix;

    public Matango(char suffix) {
        this.suffix = suffix;
    }

    public void attack (Hero h) {
        System.out.println("キノコ");
        System.out.println("10のダメージ");
        h.hp -= 10;
    }
}
