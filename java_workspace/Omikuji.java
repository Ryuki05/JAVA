package java_workspace;

import java.util.Random;

public class Omikuji {
    public static void main(String[] args) {
        Random rand = new Random();
        int kuji = rand.nextInt(100) + 1; // 1〜100
        String res = "";

        if (kuji <= 10) {
            res = "凶";
        } else if (kuji <= 30) {
            res = "小吉";
        } else if (kuji <= 60) {
            res = "中吉";
        } else if (kuji <= 90) {
            res = "吉";
        } else {
            res = "大吉";
        }

        System.out.println("くじ番号: " + kuji);
        System.out.println("結果: " + res);
    }
}
