import java.util.Scanner;

class Scan {
    public static void main(String[] args) {
        System.out.println("入力してください");
        try (Scanner scan = new Scanner(System.in)) {
            String str = scan.next();
            System.out.println(str);
        }
    }
}
