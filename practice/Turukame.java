package practice;

class Turukame {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int x = (4 * a - b) / 2;
        int y = b / 2 - a;

        System.out.println("鶴＝" + x);
        System.out.println("亀＝" + y);
    }
}
