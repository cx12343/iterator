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
        //ͨ��Mapת��Set�Ϳ��Ե���
        //�ҵ�����һ�ַ�����  entrySet
        //�÷���������ֵ��ӳ���ϵ��Ϊ����洢����Set�����У������ӳ���ϵ�����;���Map.Entry���ͣ����֤��
        
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
        /*
         *Ҳ����д�� Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
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
        //ȡ��map�е�����Ԫ�ء�
        //ԭ��ͨ��keySet������ȡmap�����еļ����ڵ�Set���ϣ���ͨ��Set�ĵ�������ȡ��ÿһ������
        //�ڶ�ÿһ����ͨ��map���ϵ�get������ȡ���Ӧ��ֵ���ɡ�
        
        Iterator<Integer> it = map.keySet().iterator();
        /*
         * �൱��  Set<Integer> keySet = map.keySet();
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