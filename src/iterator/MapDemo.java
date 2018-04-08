package iterator;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();

        
        map.put(8, "zhaoliu");
        map.put(9, "zhaoliu");
        map.put(1, "xiaoqiang");
        map.put(6, "wangcai");
        map.put(7, "zhaoliu");
        map.put(99, "zhaoliu");
        map.put(87, "xiaoqiang");
        map.put(42, "wangcai");
        
        show1(map);
        
        show2(map);
        
        showValue(map);

    }

    public static void showValue(Map<Integer, String> map) {
        Collection<String> values = map.values();
        Iterator<String> it = values.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    public static void show2(Map<Integer, String> map) {
        //通过Map转成Set就可以迭代
        //找到了另一种方法。  entrySet
        //该方法将键和值的映射关系作为对象存储到了Set集合中，而这个映射关系的类型就是Map.Entry类型（结婚证）
        
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
        /*
         *也可以写成 Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
         */
        
        while(it.hasNext())
        {
            Map.Entry<Integer, String> me = it.next();
            Integer key = me.getKey();
            String value = me.getValue();
            System.out.println(key+"::"+value);
            
        }
    }

    public static void show1(Map<Integer, String> map) {
        //取出map中的所有元素。
        //原理：通过keySet方法获取map中所有的键所在的Set集合，在通过Set的迭代器获取到每一个键，
        //在对每一个键通过map集合的get方法获取其对应的值即可。
        
        Iterator<Integer> it = map.keySet().iterator();
        /*
         * 相当于  Set<Integer> keySet = map.keySet();
         *      Iterator<Integer> it = keySet.iterator();
         *
         */
        
        while (it.hasNext())
        {
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key+"="+value);
        }
    }

}