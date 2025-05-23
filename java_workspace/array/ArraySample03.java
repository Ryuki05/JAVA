package java_workspace.array;

public class ArraySample03 {
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
        int numbersC[] = { 2, 2, 2, 3, 3, 3, 4, 4, 4, 6, 6, 6, 8, 8 };
        for (int c : numbersC) {
            System.out.print(c);
        }
        System.out.println();
        System.out.println("--------------------------------");
        int numbersD[] = new int[] { 5, 4, 3, 2, 1 };
        for (int d : numbersD) {
            System.out.print(d);
        }
        System.out.println();
        System.out.println("--------------------------------");
        char[] charcters = { 'A', 'B', 'C', 'D', 'E' };
        for (char c : charcters) {
            System.out.print(c);
        }
        System.out.println();
        System.out.println("--------------------------------");

        String[] nums = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
                "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty",
                "Twenty-One", "Twenty-Two", "Twenty-Three", "Twenty-Four", "Twenty-Five", "Twenty-Six", "Twenty-Seven",
                "Twenty-Eight", "Twenty-Nine", "Thirty", "Thirty-One", "Thirty-Two", "Thirty-Three", "Thirty-Four",
                "Thirty-Five", "Thirty-Six", "Thirty-Seven", "Thirty-Eight", "Thirty-Nine", "Forty", "Forty-One",
                "Forty-Two", "Forty-Three", "Forty-Four", "Forty-Five", "Forty-Six", "Forty-Seven", "Forty-Eight",
                "Forty-Nine", "Fifty", "Fifty-One", "Fifty-Two", "Fifty-Three", "Fifty-Four", "Fifty-Five", "Fifty-Six",
                "Fifty-Seven", "Fifty-Eight", "Fifty-Nine", "Sixty", "Sixty-One", "Sixty-Two", "Sixty-Three",
                "Sixty-Four", "Sixty-Five", "Sixty-Six", "Sixty-Seven", "Sixty-Eight", "Sixty-Nine", "Seventy",
                "Seventy-One", "Seventy-Two", "Seventy-Three", "Seventy-Four", "Seventy-Five", "Seventy-Six",
                "Seventy-Seven", "Seventy-Eight", "Seventy-Nine", "Eighty", "Eighty-One", "Eighty-Two", "Eighty-Three",
                "Eighty-Four", "Eighty-Five", "Eighty-Six", "Eighty-Seven", "Eighty-Eight", "Eighty-Nine", "Ninety",
                "Ninety-One", "Ninety-Two", "Ninety-Three", "Ninety-Four", "Ninety-Five", "Ninety-Six", "Ninety-Seven",
                "Ninety-Eight", "Ninety-Nine", "One Hundred"
        };
        for (String st : nums) {
            System.out.print(st + ",");
        }
        System.out.println();
        System.out.println("--------------------------------");

        for (int g = 1; g < nums.length; g += 2) {
            System.out.println(nums[g]);
        }
    }
}
