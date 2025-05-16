package java_workspace;

public class BreakSample02 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("i=" + i);
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    break;
                }
                System.out.println("***j=" + j);
            }
        }
        System.out.println("-----------------------");
        out_loop: for (int i = 0; i < 3; i++) {
            System.out.println("i=" + i);
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    break out_loop;
                }
                System.out.println("***j=" + j);
            }

        }
    }
}
