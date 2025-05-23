package practice;

import java.util.Scanner;

public class Practice01 {

    public static void main(String[] args) {

        /*
         * 仕様に基づいてソースコードを作成し、実行結果を得てください。
         * (仕様)
         * ・最大値を求めるプログラムです。
         * ・数値を繰返し入力で5つ取得します。
         * ・入力された数値を表示します。
         * ・最大値を表示します。
         * 
         * 入力された値に基づいて、最大値を求めるプログラムを作成してください。
         */
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[5];
        int max = 0;

        System.out.println("5回数字を入力してください");
        for (int i = 0; i < 5; i++) {
            nums[i] = scan.nextInt();
            System.out.println("入力された数値: " + nums[i]);
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("最大値: " + max);
        scan.close();
    }

}
