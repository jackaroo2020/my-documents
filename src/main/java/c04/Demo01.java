package c04;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Description: ������ת��Ϊһ���б�ʱ������Ա�Ǿ�����������
 * List<String> list = Arrays.asList(arr);
 * Arrays.asList()�᷵��һ��ArrayList����ArrayList����Arrays��һ��˽�о�̬�࣬������java.util.ArrayList�࣬java.util.Arrays.ArrayList����set()��get()��contains()����������û������Ԫ�صķ������������Ĵ�С�ǹ̶��ģ���Ҫ����һ��������ArrayList�࣬��Ӧ��������:
 * ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(arr));
 * ArrayList�Ĺ��췽�����Խ���һ���������ͣ��պ���Ҳ��java.util.Arrays.ArrayList�ĳ��ࡣ
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
