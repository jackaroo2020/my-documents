package c04;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Description: 将数组转化为一个列表时，程序员们经常这样做：
 * List<String> list = Arrays.asList(arr);
 * Arrays.asList()会返回一个ArrayList对象，ArrayList类是Arrays的一个私有静态类，而不是java.util.ArrayList类，java.util.Arrays.ArrayList类有set()、get()、contains()方法，但是没有增加元素的方法，所以它的大小是固定的，想要创建一个真正的ArrayList类，你应该这样做:
 * ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(arr));
 * ArrayList的构造方法可以接受一个集合类型，刚好它也是java.util.Arrays.ArrayList的超类。
 * @Author: LT
 * @CreateDate: 2019/12/3 13:44
 * @Version: 1.0.0
 */
public class Demo01 {

    public static void main(String[] args) {
        String[] str = {"test1","demo2","adf"};
        //List<String> list = Arrays.asList(str);
        //System.out.println(list.set(0,"test1"));
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(str));
        arrayList.add("add");
        System.out.println(arrayList.size());
    }
}
