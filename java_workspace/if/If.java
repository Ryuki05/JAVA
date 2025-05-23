package java_workspace;

import java.util.Random;

public class If {

    public static void main(String[] args) {
        Random random = new Random();

        int r = random.nextInt(100) + 1;
        System.out.println("乱数:" + r);

        if (r > 50) {
            System.out.println("合格");
        } else {
            System.out.println("不合格");
        }

        if (r > 50) {
            System.out.println("合格");
        }
        if (r <= 50) {
            System.out.println("不合格");
        }

        // 三項演算子
        System.out.println(r > 50 ? "合格" : "不合格");
    }

}
