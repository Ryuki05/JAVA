package practice;

class Bmi {
    public static void main(String[] args) {
        float w, h, bmi;
        w = Float.parseFloat(args[0]);
        h = Float.parseFloat(args[1]);
        bmi = w / (h * h);
        System.out.println(bmi);
    }
}
