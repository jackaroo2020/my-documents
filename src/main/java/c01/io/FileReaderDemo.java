package c01.io;

import java.io.FileReader;
import java.io.IOException;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/12/3 17:50
 * @Version: 1.0.0
 */
public class FileReaderDemo {

    /**
     * 一个一个读取
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

    public static void arrayRead() throws IOException {
        FileReader fileReader = new FileReader("g:\\fileWriter.txt");
        char[] buf = new char[1024];
        int len = 0;
        while ((len=fileReader.read(buf))!=-1){
            System.out.println(new String(buf,0,len));
        }
        fileReader.close();
    }

    public static void main(String[] args) throws IOException {
        //charRead();
        arrayRead();
    }
}
