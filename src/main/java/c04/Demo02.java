package c04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @Description: java����������
 * @Author: LT
 * @CreateDate: 2019/12/3 13:57
 * @Version: 1.0.0
 */
public class Demo02 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("a","b","c","d"));

        // 1. ��һ��Ԫ�ر�ɾ��ʱ���б�Ĵ�С��С�����±�仯�����Ե�����Ҫ��һ��ѭ�������±�ɾ�����Ԫ�ص�ʱ������������������Ч��
        //for (int i = 0; i < arrayList.size(); i++) {
        //    arrayList.remove(i);
        //}
        //System.out.println(arrayList);

        // 2��Exception in thread "main" java.util.ConcurrentModificationException
        //	at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:901)
        //	at java.util.ArrayList$Itr.next(ArrayList.java:851)
        //	at c04.Demo02.main(Demo02.java:26)
        //for (String s : arrayList) {
        //    if (s.equalsIgnoreCase("a")) {
        //        arrayList.remove(s);
        //    }
        //}
        //System.out.println(arrayList);

        // 3��.next()������.remove()֮ǰ���á���һ��foreachѭ���У���������ʹ.next()��ɾ��Ԫ��֮�󱻵��ã���˾ͻ��׳�ConcurrentModificationException�쳣
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.equalsIgnoreCase("a")) {
                it.remove();
            }
        }
        System.out.println(arrayList);

    }

}
