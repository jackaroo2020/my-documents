package c01.io;


import java.io.*;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/12/6 10:39
 * @Version: 1.0.0
 */
public class InputStreamDemo {

    public static void main(String[] args) throws IOException {
        //read("g:\\fileStream.txt");
        //copy1("G:\\周杰伦 - 轨迹.kgm","G:\\周杰伦 - 轨迹copy.kgm");
        copy2("G:\\周杰伦 - 轨迹.kgm","G:\\周杰伦 - 轨迹copy.kgm");
    }

    /**
     * 读取硬盘上的文件
     * **第一种读法：一个字节一个字节的读(此种读法慢)(中文乱码)
     *
     * @param filePath
     */
    public static void read(String filePath) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        int ch = 0;
        while ((ch =fis.read())!=-1) {
            System.out.print((char) ch);
        }
        fis.close();
    }

    /**
     * 利用字节数组读(此种读法效率有一定提高)
     *
     * @param filePath
     * @throws IOException
     */
    public static void read2(String filePath) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len=fis.read(buf))!= -1) {
            System.out.println(new String(buf,0,len));
        }
        fis.close();
    }

    /**
     * 拷贝字节文件，如图片或者MP3或者电影
     *
     * @param sourceFile
     * @param targetFile
     * @throws IOException
     */
    public static void copy1(String sourceFile,String targetFile) throws IOException{
        FileInputStream fis = new FileInputStream(sourceFile);
        FileOutputStream fos = new FileOutputStream(targetFile);

        byte[] buf = new byte[1024];
        int len = 0;
        while ((len=fis.read(buf))!=-1) {
            fos.write(buf,0,len);
        }
        fis.close();
        fos.close();
    }

    /**
     * 拷贝字节文件，如图片或者MP3或者电影
     *
     * @param sourceFile
     * @param targetFile
     * @throws IOException
     */
    public static void copy2(String sourceFile,String targetFile) throws IOException{
        BufferedInputStream fis = new BufferedInputStream(new FileInputStream(sourceFile));
        BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(targetFile));

        byte[] buf = new byte[1024];
        int len = 0;
        while ((len=fis.read(buf))!=-1) {
            fos.write(buf,0,len);
        }
        fis.close();
        fos.close();
    }
}
