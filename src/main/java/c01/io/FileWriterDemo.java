package c01.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/12/3 17:27
 * @Version: 1.0.0
 */
public class FileWriterDemo {

    public static void main(String[] args) throws IOException {
       writer1();
       writer2();
    }

    public static void writer1() throws IOException {
        FileWriter fileWriter = new FileWriter("g:\\fileWriter.txt");
        fileWriter.write("测试看下\r\n");
        fileWriter.write("字节数组\r\n".toCharArray());
        fileWriter.flush();
        fileWriter.close();
    }

    public static void  writer2() throws IOException {
        FileWriter fw = new FileWriter("g:\\filewriter.txt",true);
        fw.write("还可以续写信息\r\n");
        fw.write("也可以写入字符数组\r\n".toCharArray());
        fw.flush();
        fw.close();
    }
}
