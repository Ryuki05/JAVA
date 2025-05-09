import java.util.HashMap;
import java.util.Map;

class Jisho {
    public static void main(String[] args) {
        // Mapの宣言
        Map<String, String> map = new HashMap<>();

        // Mapにキーと値を格納
        map.put("key1", "oreange");
        map.put("key2", "apple");
        map.put("key3", "melon");

        // Mapからデータを取得する
        System.out.println(map.get("key1"));
        System.out.println(map.get("key2"));
        System.out.println(map.get("key3"));

        // キーをすべて取得
        Map<String, String> map_all = new HashMap<>();
        map_all.put("samurai", "侍");
        map_all.put("enginner", "エンジニア");

        for (String key : map_all.keySet()) {
            System.out.println(key);
        }

        // value取得
        Map<String, String> map_val = new HashMap<>();
        map_val.put("samurai", "侍");
        map_val.put("enginner", "エンジニア");
        for (String val : map_val.values()) {
            System.out.println(val);
        }

        // key$val取得
        Map<String, String> map_key_val = new HashMap<>();
        map_key_val.put("samurai", "侍");
        map_key_val.put("engineer", "エンジニア");
        for (Map.Entry<String, String> entry : map_key_val.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
