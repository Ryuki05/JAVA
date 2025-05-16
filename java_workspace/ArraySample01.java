package java_workspace;

public class ArraySample01 {
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[5];
        System.out.println(numbers);
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 3;
        numbers[4] = 4;
        System.out.println(numbers);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        System.out.println("--------------------------------");
        int numbers2[] = new int[] { 5, 4, 3, 2, 1 };
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }

        System.out.println("--------------------------------");
        int numbers3[] = { 2, 2, 2, 3, 3, 3, 4, 4, 4, 6, 6, 6, 8, 8 };
        for (int i = 0; i < numbers3.length; i++) {
            System.out.print(numbers3[i]);
        }

    }
}
