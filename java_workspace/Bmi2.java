package java_workspace;

import java.util.Scanner;

public class Bmi2 {
    public static void main(String[] args) {
        float w, h, bmi;
        ;
        // 桁数を指定
        double expo = 2;
        double base = 10;
        double result = Math.pow(base, expo);

        Scanner scan = new Scanner(System.in);
        System.out.println("体重(Kg)/身長(cm)を入力");
        w = scan.nextFloat();
        h = scan.nextFloat();
        h = h / 100;
        bmi = w / (h * h);
        System.out.println("----------------------------------");
        System.out.println("BMI:" + Math.round(bmi * result) / result);

        if (bmi < 18.5) {
            System.out.println("やせ型");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("標準型");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("肥満型");
        } else {
            System.out.println("高度肥満型");
        }

        System.out.println("体重" + w + "Kg");
        System.out.println("身長" + h * 100 + "cm");
    }
}
