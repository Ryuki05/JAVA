package java_workspace.if_statement;

import java.util.Random;

public class If2 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(6);

        String result = "";

        if (num == 0) {
            result = "0";
        } else if (num % 2 == 0) {
            result = "偶数";
        } else {
            result = "奇数";
        }
        System.out.println("乱数は" + num + "," + result + "です。");

        // ネススト
        if (num == 0) {
            result = "0";
        } else {
            if (num % 2 == 0) {
                result = "偶数";
            } else {
                result = "奇数";
            }
        }
        System.out.println("乱数は" + num + "," + result + "です。");
    }
}
