package Lesson_10;

import java.util.*;

public class RepitWords {
    public static void main(String[] args) {
        String [] words = {"апельсин","банан","апельсин","вишня","персик","персик","банан","яблоко","яблоко"};
        HashMap<String, Integer> map = new HashMap<>();


        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);

            } else {
                map.put(word, 1);
            }
        }
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key+" "+map.get(key));

        }

    }
}
