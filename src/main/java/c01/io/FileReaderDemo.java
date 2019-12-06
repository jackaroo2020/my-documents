package c01.io;

import java.io.*;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/12/3 17:50
 * @Version: 1.0.0
 */
public class FileReaderDemo {

    /**
     * 读取硬盘上的文本文件，并将数据打印在控制台
     * 第一种读取方法：一个一个字节的读
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
     * 读取硬盘上的文本文件，并将数据打印在控制台
     * 第二种读取方法：利用数组来提高效率
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
     * 拷贝文本文件
     * 		利用缓冲区提高数据读写效率
     * 		(无缓冲区就相当于一滴一滴的喝水，有缓冲区就相当于一杯一杯的喝水)
     *
     * @param sourceFileDir  源目录
     * @param dirFileDir 目标目录全路径
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
