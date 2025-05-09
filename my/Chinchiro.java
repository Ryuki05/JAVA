package my;
// import java.util.Random;

class Chinchiro {
    public static void main(String[] args) {
        // Random rand = new Random();
        int d1 = (int) (Math.random() * 6) + 1;
        int d2 = (int) (Math.random() * 6) + 1;
        int d3 = (int) (Math.random() * 6) + 1;

        if (d1 == d2) {
            System.out.println(d1);
        } else if (d2 == d3) {
            System.out.println(d2);
        } else if (d3 == d1) {
            System.out.println(d3);
        } else if (d1 == 1 && d2 == 2 && d3 == 3) {
            String re = "一二三";
            System.out.println(re);

        } else if (d1 == 4 && d2 == 5 && d3 == 6) {
            String re = "四五六";
            System.out.println(re);

        } else if (d1 == 1 && d2 == 1 && d3 == 1) {
            String re = "ピンゾロ";
            System.out.println(re);

        } else if (d1 == d2 && d2 == d3) {
            String re = "ゾロ目";
            System.out.println(re);
        } else {
            String re = "出目なし";
            System.out.println(re);
        }

    }
}
