package practice;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {

		/*
		 * 仕様に基づいてソースコードを作成し、実行結果を得てください。
		 * (仕様)
		 * ・映画館の入場料を求めるプログラムです。
		 * ・年齢を入力で取得します。
		 * ・会員かどうかを入力で取得します。
		 * ・20歳以上の会員は1100円、非会員は1500円です。
		 * ・20歳未満の会員は500円、非会員は800円です。
		 * 
		 * 年齢と会員かどうかにの値に基づいて、入場料金を求めるプログラムを作成してください。
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("年齢を入力してください");
		System.out.println("会員の方は0を非会員のかたは1を入力してください");
		int age = scan.nextInt();
		int prime = scan.nextInt();
		String maney[][];
		maney = new String[2][2];
		maney[0][0] = "料金は１１００円です";
		maney[0][1] = "料金は１５００円です";
		maney[1][0] = "料金は５００円円です";
		maney[1][1] = "料金は８００円です";
		if (age >= 20 && prime == 0) {
			age = 0;
			prime = 0;
		} else if (age >= 20 && prime == 1) {
			age = 0;
			prime = 1;
		} else if (age < 20 && prime == 0) {
			age = 1;
			prime = 0;
		} else {
			age = 1;
			prime = 1;
		}
		System.out.println(maney[age][prime]);
	}

}
