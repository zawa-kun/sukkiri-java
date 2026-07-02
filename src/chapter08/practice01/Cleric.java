
import java.util.Random;



public class Cleric {
    String name;
    int hp = 50;
    int mp  = 10;
    final int MAX_HP = 50;
    final int MAX_MP = 10;

    void selfAid() {
        // MPが5以下なら何もしない
        if (mp < 5) {
            return;
        }

        this.mp -= 5;
        this.hp = MAX_HP;
    }

    int pray(int time) {
        int healMp = time + new Random().nextInt(2);
        
        if (mp + healMp > MAX_MP) {
            int prevMp = mp;
            mp = MAX_MP;
            return MAX_MP - prevMp;
        } else {
            mp += healMp;
            return healMp; 
        }
    }
}