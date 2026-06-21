package chapter02;

public class ParseInt {
    public static void main(String[] args) {
        String age = "22";
        Integer ageNum = Integer.parseInt(age);
        System.out.println(ageNum.getClass());
        System.out.println(ageNum);
    }

}
