package java_workspace;

public class WhileSample01 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        i = 0;
        while (i < 5) {
            System.out.println("java");
            i++;
        }
        i = 10;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
        i = 1;
        while (i <= 20) {
            System.out.println(i);
            i += 2;
        }
        i = 1;
        int sum = 0;
        while (i <= 1000) {
            sum += i;
            i += i;
        }
        System.out.println(sum);
    }
}
