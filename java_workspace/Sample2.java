package java_workspace;

public class Sample2 {
    public static void main(String[] args) {
        submain("100");

    }

    public static void submain(String something) {
        System.out.println(something);

        // Integer型に変換
        int num = Integer.parseInt(something);
        System.out.println(num);
    }
}
