public class DoWhileSample {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
        i = 0;
        do {
            System.out.println("java");
            i++;
        } while (i < 5);
        i = 10;
        do {
            System.out.println(i);
            i--;
        } while (i > 0);
        i = 0;
        do {
            System.out.println(i);
            i += 2;
        } while (i <= 20);
        int sum = 0;
        i = 1;
        do {
            sum += i;
            i += i;
        } while (i <= 1000);
        System.out.println(sum);
    }
}
