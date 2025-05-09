package java_workspace;

class Datatype {
    public static void main(String[] args) {
        // 8進数 頭に0をつける
        int a = 011;
        System.out.println(a);

        // 16進数 頭に0xをつける
        int b = 0x11;
        System.out.println(b);

        // 2進数 頭に0bをつける
        int c = 0b11;
        System.out.println(c);

        // 出力はすべて10進数

        // byte型
        byte d = 10;
        System.out.println(d);

        // 浮動小数点型
        double e = 3.14d;
        System.out.println(e);

        float f = 3.14f;
        System.out.println(f);

        int ans = 3 / 2;
        System.out.println(ans);

        double ans2 = 3d / 2d;
        System.out.println(ans2);

        double ans3 = 3d / 2d;
        System.out.println(ans3);

        double ans4 = 3 / 2;
        System.out.println(ans4);

        double ans5 = 3d / 2;
        System.out.println(ans5);

        double ans6 = 3 / 2d;
        System.out.println(ans6);

        // 参照型
        String str = "java";
        System.out.println(str);

        String str2 = str;
        System.out.println(str2);

        str = "python";
        System.out.println(str2);
    }
}
