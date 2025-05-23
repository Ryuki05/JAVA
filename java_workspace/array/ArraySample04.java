package java_workspace.array;

public class ArraySample04 {
    public static void main(String[] args) {
        // 多次元配列の宣言
        // データ型[][] 変数名:

        int[][] nums;

        String str[][];

        // 初期化
        nums = new int[2][3];

        nums[0][0] = 101;
        nums[0][1] = 102;
        nums[0][2] = 103;

        nums[1][0] = 201;
        nums[1][1] = 202;
        nums[1][2] = 203;

        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(nums[x][y] + " / ");
            }
            System.out.println();
        }
    }
}
