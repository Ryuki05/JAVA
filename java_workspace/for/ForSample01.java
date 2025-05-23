
public class ForSample01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("java");
        }

        for (int a = 10; a >= 0; a--) {
            System.out.println(a);
        }

        for (int i = 0; i <= 20; i += 2) {
            System.out.println(i);
        }

        int sum = 0;
        for (int i = 1; i <= 1000; i += i) {
            sum += i;
        }
        System.out.println(sum);
    }
}
