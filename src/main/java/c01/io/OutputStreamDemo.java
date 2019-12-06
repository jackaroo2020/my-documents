package c01.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/12/6 10:16
 * @Version: 1.0.0
 */
public class OutputStreamDemo {

    public static void main(String[] args) throws IOException {
        //writer("g:\\fileStream.txt");
        writeAppend("g:\\fileStream.txt");
    }

    /**
     * 需求1：在硬盘上创建一个文件并写入信息(字节流写入时没有刷新
     */
    public static void writer(String filePath) throws IOException {
        FileOutputStream fos = new FileOutputStream(filePath);
        // 97 对应字符 a
        fos.write(97);
        fos.write("字节数组".getBytes());
        fos.close();
    }

    /**
     * 在硬盘已有文件上续写数据(字节流写入时没有刷新)
     *
     * @param filePath
     * @throws FileNotFoundException
     */
    public static void writeAppend(String filePath) throws IOException {
        FileOutputStream fos = new FileOutputStream(filePath,true);
        // 97 对应字符 a
        fos.write(98);
        fos.write("续写字节数组".getBytes());
        fos.close();
    }
}
