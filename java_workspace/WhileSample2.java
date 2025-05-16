package java_workspace;

import java.util.Random;
import java.util.Scanner;

public class WhileSample2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int userGuess;
        int correctCount = 0;

        System.out.println("数あてゲーム! 1から100までの数を当ててください。3回正解すると終了します。");

        while (correctCount < 3) {
            int targetNumber = random.nextInt(100) + 1; // 1から100までの乱数
            boolean hasWon = false;
            int attempts = 0;

            while (!hasWon) {
                System.out.print("あなたの予想を入力してください: ");
                userGuess = scan.nextInt();
                attempts++;

                if (userGuess < targetNumber) {
                    System.out.println("もっと大きい数です。");
                } else if (userGuess > targetNumber) {
                    System.out.println("もっと小さい数です。");
                } else {
                    System.out.println("正解です！" + attempts + "回目で正解しました。");
                    hasWon = true;
                    correctCount++;
                }
            }
        }

        System.out.println("おめでとうございます！3回正解しました。ゲーム終了です。");
        scan.close();
    }
}
