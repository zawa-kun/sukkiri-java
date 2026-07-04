package chapter09.practice;

// この書き方はあまり良くない。
// 責任の所在の分離
// 「最も詳細な情報を持つコンストラクタに処理をまとめるという原則への違反
public class Thief {
    String name;
    int hp;
    int mp;

    public Thief(String name) {
        this.name = name;
        this.hp = 40;
        this.mp = 5;
    }

    public Thief(String name, int hp) {
        this(name);
        this.hp = hp;
        this.mp = 5;
    }

    public Thief(String name, int hp, int mp) {
        this(name, hp);
        this.mp = mp;
    }
}
