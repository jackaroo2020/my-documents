package c01.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description: java����������
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
     * ����1����Ӳ���ϴ���һ���ļ���д����Ϣ(�ֽ���д��ʱû��ˢ��
     */
    public static void writer(String filePath) throws IOException {
        FileOutputStream fos = new FileOutputStream(filePath);
        // 97 ��Ӧ�ַ� a
        fos.write(97);
        fos.write("�ֽ�����".getBytes());
        fos.close();
    }

    /**
     * ��Ӳ�������ļ�����д����(�ֽ���д��ʱû��ˢ��)
     *
     * @param filePath
     * @throws FileNotFoundException
     */
    public static void writeAppend(String filePath) throws IOException {
        FileOutputStream fos = new FileOutputStream(filePath,true);
        // 97 ��Ӧ�ַ� a
        fos.write(98);
        fos.write("��д�ֽ�����".getBytes());
        fos.close();
    }
}
