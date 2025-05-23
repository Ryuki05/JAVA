package java_workspace.rand;

import java.util.Random;

public class Rand {
    public static void main(String[] args) {
        Random random = new Random();
        int rand = random.nextInt(10);
        System.out.println("乱数" + rand);

        boolean res = random.nextBoolean();
        System.out.println("結果" + res);

    }
}
