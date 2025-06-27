package library;

import java.util.Random;

public class Sample {
    public static void main(String[] args) {
        // 乱数の生成
        int rand = new Random().nextInt(6) + 1;

        System.out.println(rand);
    }
}
