package java_workspace;

import java.util.Random;
import java.util.Scanner;

public class Janken02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String user = "";

        while (true) {
            System.out.println("グー/チョキ/パー を入力");
            user = scan.nextLine();
            if (user.equals("グー") || user.equals("チョキ") || user.equals("パー")) {
                break; // 有効な入力の場合、ループを抜ける
            } else {
                System.out.println("無効な入力です。もう一度入力してください。");
            }
        }

        System.out.println("ユーザー:" + user);
        scan.close();

        Random random = new Random();
        int num = random.nextInt(3);

        String pc = "";
        // if (num == 0) {
        // pc = "グー";
        // } else if (num == 1) {
        // pc = "チョキ";
        // } else {
        // pc = "パー";
        // }

        switch (pc) {
            case "0":
                pc = "グー";
                break;
            case "1":
                pc = "チョキ";
                break;
            case "2":
                pc = "パー";
                break;

            default:
                break;
        }

        System.out.println("PC:" + pc);
        String result = "";
        if (user.equals(pc)) {
            result = "引き分け";
        } else if ((user.equals("グー") && pc.equals("チョキ")) ||
                (user.equals("チョキ") && pc.equals("パー")) ||
                (user.equals("パー") && pc.equals("グー"))) {
            result = "勝ち";
        } else {
            result = "負け";
        }
        System.out.println("結果:" + result);
    }
}
