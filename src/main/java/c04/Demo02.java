package c04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/12/3 13:57
 * @Version: 1.0.0
 */
public class Demo02 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("a","b","c","d"));

        // 1. 当一个元素被删除时，列表的大小缩小并且下标变化，所以当你想要在一个循环中用下标删除多个元素的时候，它并不会正常的生效。
        //for (int i = 0; i < arrayList.size(); i++) {
        //    arrayList.remove(i);
        //}
        //System.out.println(arrayList);

        // 2、Exception in thread "main" java.util.ConcurrentModificationException
        //	at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:901)
        //	at java.util.ArrayList$Itr.next(ArrayList.java:851)
        //	at c04.Demo02.main(Demo02.java:26)
        //for (String s : arrayList) {
        //    if (s.equalsIgnoreCase("a")) {
        //        arrayList.remove(s);
        //    }
        //}
        //System.out.println(arrayList);

        // 3、.next()必须在.remove()之前调用。在一个foreach循环中，编译器会使.next()在删除元素之后被调用，因此就会抛出ConcurrentModificationException异常
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
