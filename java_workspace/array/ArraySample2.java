package java_workspace.array;

public class ArraySample2 {
    public static void main(String[] args) {
        float numbers[] = { 20, 30, 60, 40, 80 };
        float sum = 0;
        float avg = 0;
        float max = 0, min = 100;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (max < numbers[i]) {
                max = numbers[i];
            }
            if (min >= numbers[i]) {
                min = numbers[i];
            }
        }
        avg = sum / 5;
        System.out.println("合計点:" + sum);
        System.out.println("平均点:" + avg);
        System.out.println("最高点:" + max);
        System.out.println("最低点:" + min);
    }
}
