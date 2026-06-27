package calcapp.main;
import calcapp.logics.CalcLogic;

public class Calc {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        System.out.println("tasu(): " + CalcLogic.tasu(a, b));
        System.out.println("hiku(): " + CalcLogic.hiku(a, b));
    }
}