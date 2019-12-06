package c01.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Description: java����������
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
        fileWriter.write("���Կ���\r\n");
        fileWriter.write("�ֽ�����\r\n".toCharArray());
        fileWriter.flush();
        fileWriter.close();
    }

    public static void  writer2() throws IOException {
        FileWriter fw = new FileWriter("g:\\filewriter.txt",true);
        fw.write("��������д��Ϣ\r\n");
        fw.write("Ҳ����д���ַ�����\r\n".toCharArray());
        fw.flush();
        fw.close();
    }
}
