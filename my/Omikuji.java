package my;

import java.util.Random;

class Omikuji {
    public static void main(String[] args) {
        Random rand = new Random();
        int kuji = rand.nextInt(3);

        if (kuji == 0) {
            String res = "大吉";
            System.out.println(res);
        } else if (kuji == 1) {
            String res = "吉";
            System.out.println(res);
        } else {
            String res = "凶";
            System.out.println(res);
        }

    }

}
