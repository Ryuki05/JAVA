package java_workspace;

public class Logical {
    public static void main(String[] args) {

        // and
        System.out.println("true && true:" + (true && true));
        System.out.println("true && false:" + (true && false));
        System.out.println("false && true:" + (false && true));
        System.out.println("false && false:" + (false && false));

        // or
        System.out.println("true && true:" + (true || true));
        System.out.println("true && false:" + (true || false));
        System.out.println("false && true:" + (false || true));
        System.out.println("false && false:" + (false || false));

        // xor
        System.out.println("true ^ true:" + (true ^ true));
        System.out.println("true ^ false:" + (true ^ false));
        System.out.println("false ^ true:" + (false ^ true));
        System.out.println("false ^ false:" + (false ^ false));
    }
}
