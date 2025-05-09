package java_workspace;

class Related {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        System.out.println("a>b:" + (a > b));
        System.out.println("a<b:" + (a < b));
        System.out.println("a==b:" + (a == b));
        System.out.println("a != b:" + (a != b));

        // 比較結果はbookean型
        boolean result = a < b;
        System.out.println(result);
    }

}