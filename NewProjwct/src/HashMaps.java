import java.util.HashMap;
import java.util.Map;

public class HashMaps {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        // add some key-value pairs to the map
        map.put("apple", "red");
        map.put("banana", "yellow");
        map.put("orange", "orange");

        String color = map.get("apple");

        System.out.println("The color of apple is : " +color);

        System.out.println("The keys in the map are : ");

        for(String key : map.keySet()){
            System.out.println(key);
        }

        System.out.println("The values in the map are : ");

        for (String val : map.values()){
            System.out.println(val);
        }

        for (String key : map.keySet()){
            System.out.println(map.get(key));
        }



        // remove a key-value pair from the map
        map.remove("banana");

        // check if a key is present in the map
        boolean containsKey = map.containsKey("banana");
        System.out.println("Does the map contain a banana? " + containsKey);

        // check if a value is present in the map
        boolean containsValue = map.containsValue("red");
        System.out.println("Does the map contain the color red? " + containsValue);
    }
}
