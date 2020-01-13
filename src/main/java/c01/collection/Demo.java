package c01.collection;

import java.util.*;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/12/3 17:14
 * @Version: 1.0.0
 */
public class Demo {

    public static void main(String[] args) {
        // Collections
        System.out.println(Collections.EMPTY_LIST);
        // List
        List<String> list = new ArrayList<String>();
        List<String> list1 = new LinkedList<String>();
        // Set
        Set<String> set = new HashSet<String>();
        // Map
        Map<String,String> map = new HashMap();
    }
}
