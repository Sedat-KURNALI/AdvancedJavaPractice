package TECHNOSTUDY_USA.day25;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Task1 {
    // Write a Java program to associate
    // the specified value with the specified key in a HashMap.
    public static void main(String[] args) {

        HashMap<String, String> login = new HashMap<>();
        login.put("John", "2324sdfd@");
        login.put("Sam", "2sfd324@sdfd76");
        login.put("June", "2sdgDDD24@sdvd");

        HashMap<String, String> secondMap = copyMap(login);
        System.out.println("login: " + login);
        removeAllEntries(login);
        System.out.println("login: " + login);
        System.out.println("second:" + secondMap);
        System.out.println(mapSize(secondMap));


        System.out.println(login);
        System.out.println(mapSize(login));
    }

    // create method that return size of your map
    public static int mapSize (HashMap<String, String> map) {
        //map.keySet().size(); // gives size of keys in map

        return map.size();
    }
    // create method to remove all of the mappings/entries from a map
    public static void removeAllEntries (HashMap<String, String> map) {
        // 1. way
        map.clear();// removes everything from map

        // 2. way
        Set<String> keys = new HashSet<>(map.keySet());
        for(String key : map.keySet()) {
            map.remove(key);
            
        }
    }

    // create method to copy all of the mappings
    // from the specified map to another map
    public static HashMap<String, String> copyMap (HashMap<String, String> map){
        //1. way
        HashMap<String, String> copyMap = new HashMap<>(map);
        return copyMap;

        //2. way
        //HashMap<String, String> copyMap = new HashMap<>();
        //copyMap.putAll(map);
        //    return copyMap;
    }
}

