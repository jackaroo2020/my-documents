package c01.io;

import java.io.*;

/**
 * @Description: java����������
 * @Author: LT
 * @CreateDate: 2019/12/3 17:50
 * @Version: 1.0.0
 */
public class FileReaderDemo {

    /**
     * ��ȡӲ���ϵ��ı��ļ����������ݴ�ӡ�ڿ���̨
     * ��һ�ֶ�ȡ������һ��һ���ֽڵĶ�
     *
     * @throws IOException
     */
    public static void charRead() throws IOException {
        FileReader fileReader = new FileReader("g:\\fileWriter.txt");
        int ch ;
        while ((ch=fileReader.read()) != -1){
            System.out.print((char) ch);
        }
        fileReader.close();
    }

    /**
     * ��ȡӲ���ϵ��ı��ļ����������ݴ�ӡ�ڿ���̨
     * �ڶ��ֶ�ȡ�������������������Ч��
     *
     * @throws IOException
     */
    public static void arrayRead() throws IOException {
        FileReader fileReader = new FileReader("g:\\fileWriter.txt");
        char[] buf = new char[1024];
        int len = 0;
        while ((len=fileReader.read(buf))!=-1){
            System.out.println(new String(buf,0,len));
        }
        fileReader.close();
    }

    /**
     * �����ı��ļ�
     * 		���û�����������ݶ�дЧ��
     * 		(�޻��������൱��һ��һ�εĺ�ˮ���л��������൱��һ��һ���ĺ�ˮ)
     *
     * @param sourceFileDir  ԴĿ¼
     * @param dirFileDir Ŀ��Ŀ¼ȫ·��
     */
    public static void copyFile(String sourceFileDir,String dirFileDir) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(sourceFileDir));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(dirFileDir));
        String line = null;
        while ((line = fileReader.readLine()) != null) {
            fileWriter.write(line);
            fileWriter.newLine();
            fileWriter.flush();
        }
        fileReader.close();
        fileWriter.close();
    }

    public static void main(String[] args) throws IOException {
        //charRead();
        //arrayRead();
        copyFile("g:\\fileWriter.txt","g:\\copyfileWriter.txt");
    }
}
