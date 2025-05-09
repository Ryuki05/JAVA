package my;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class List1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("key1", "apple");
        map.put("key2", "orange");
        map.put("key3", "melon");

        List<String> list = new ArrayList<>(map.values());

        String apple = list.get(0);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(apple);
    }

}
