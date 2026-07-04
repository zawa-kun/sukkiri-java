package chapter10.practice;

public class PoisonMatango  extends Matango {
    int remainingAttackCount = 5; // 残りの攻撃回数

    public PoisonMatango(char suffix) {
        super(suffix);
    }

    @Override
    public void attack(Hero h) {
        super.attack(h);

        if (this.remainingAttackCount > 0) {
            System.out.println("さらに毒の胞子をばらまいた！");
            int poisonDamage = h.hp / 5;
            h.hp -= poisonDamage;
            System.out.println(poisonDamage + "のダメージ！");
            this.remainingAttackCount --;
        }
    }
}
