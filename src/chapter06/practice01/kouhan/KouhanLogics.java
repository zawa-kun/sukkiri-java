package practice01.kouhan;

import practice01.zenhan.ZenhanLogics;
import java.lang.Thread;

public class KouhanLogics {
    public static void callDeae() {
        System.out.println("You scoundrel!");
    }

    public static void showMondokoro() throws Exception {
        System.out.println("Do you not recognize this crest?");
        Thread.sleep(3000); // 6-3: 待ち時間を3秒
        ZenhanLogics.doTogame(); // もう一度とがめる。
    }
}
