package practice;

import java.util.Random;
import java.util.Scanner;

public class Janken03 {

	public static void main(String[] args) {

		/*
		 * (仕様)
		 * じゃんけんのプログラムです。
		 * 以下の配列handsを活用してください。
		 * 3回勝つか負けるかでゲーム終了です。
		 * 対戦中や結果の表示などはしっかり作り込んでください。
		 */

		String[] hands = { "グー", "チョキ", "パー" };
		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		int winCount = 0;
		int loseCount = 0;

		for (int i = 0; winCount < 3 && loseCount < 3; i++) {
			System.out.println("\nじゃんけん...");
			System.out.println("1:グー 2:チョキ 3:パー");
			int user = scan.nextInt();

			if (user < 1 || user > 3) {
				System.out.println("1から3の数字を入力してください");
				continue;
			}

			int pc = random.nextInt(3) + 1;
			System.out.println("あなた: " + hands[user - 1]);
			System.out.println("PC: " + hands[pc - 1]);

			if (user == pc) {
				System.out.println("あいこ");
			} else if ((user == 1 && pc == 2) || (user == 2 && pc == 3) || (user == 3 && pc == 1)) {
				winCount++;
				System.out.println("勝ち");
			} else {
				loseCount++;
				System.out.println("負け");
			}

			System.out.println(winCount + "勝" + loseCount + "敗");
		}

		System.out.println("\nゲーム終了！");
		System.out.println(winCount >= 3 ? "あなたの勝ち" : "あなたの負け");

		scan.close();
	}

}
