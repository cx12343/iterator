package iterator;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Tset01 {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Map<String, String> maps = new HashMap<String, String>();
        maps.put("111", "111a");
        maps.put("222", "222b");
        maps.put("444", "444d");
        maps.put("555", "555e");
        maps.put("666", "666f");
        
        for(String str : maps.keySet()){
            System.out.println(str + ":" + maps.get(str));
        }
        
        System.out.println("--------------");
        
        for(Entry<String, String> str : maps.entrySet()){
            System.out.println(str + "   " + str.getKey() + ":" + str.getValue());
        }

    }
}
