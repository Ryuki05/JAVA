package java_workspace;

public class ForSample2 {
    public static void main(String[] args) {
        int i, j = 0;

        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                System.out.print("@");
            }
            System.out.println("@");
        }
        System.out.println("-------------");
        i = 0;
        j = 0;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }

        System.out.println("-------------");
        i = 0;
        j = 0;
        for (i = 1; i <= 5; i++) {
            for (j = 5; j >= i; j--) {
                System.out.print("@");
            }
            System.out.println();
        }

        System.out.println("-------------");
        int x, y = 0;
        for (y = 1; y <= 9; y++) {
            for (x = 1; x <= 9; x++) {

                System.out.print(y * x + " ");
            }
            System.out.println();
        }

    }
}
