package my;

// import java.util.ArrayList;
import java.util.HashMap;
// import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Jihanki {
    public static void main(String[] args) {
        Map<String, String> jihanki = new HashMap<>();

        jihanki.put("item1", "kora");
        jihanki.put("item2", "ocha");
        jihanki.put("item3", "mizu");

        // List<String> Item = new ArrayList<>(jihanki.values());
        String kora = jihanki.get("item1");
        String ocha = jihanki.get("item2");
        String mizu = jihanki.get("item3");

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("商品を入力してください（kora/ocha/mizu）:");
            int price = 0;
            boolean valid = true;
            String item = scan.next();
            if (item.equals(kora)) {
                System.out.println("コーラは１６０円");
                price = 160;
            } else if (item.equals(ocha)) {
                System.out.println("お茶は１４０円");
                price = 140;
            } else if (item.equals(mizu)) {
                System.out.println("水は１１０円");
                price = 110;
            } else {
                System.out.println("error");
                valid = false;
            }

            if (valid) {
                System.out.println("お金を入れて");
                int money = scan.nextInt();

                if (money >= price) {
                    int change = money - price;
                    System.out.println("決済完了。おつりは" + change);
                } else {
                    System.out.println("お金が足りません。もう一度やり直してください");
                }
            }
        }

    }
}
