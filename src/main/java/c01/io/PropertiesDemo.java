package c01.io;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/12/6 14:05
 * @Version: 1.0.0
 */
public class PropertiesDemo {

    public static void show()
    {
        Properties prop = new Properties();
        prop.setProperty("张三","26");
        prop.setProperty("李四","30");
        prop.setProperty("王五","35");
        System.out.println(prop);
        String value = prop.getProperty("张三");
        System.out.println(value);

        Set<String> keys = prop.stringPropertyNames();
        for(String key : keys)
        {
            System.out.println(key+":"+prop.getProperty(key));
        }
    }



    /**
     *  需求：记录应用程序的使用次数，如果使用次数已到，则提示用户注册。
     *     思路：
     *             **第一次使用时建立一个配置文件用于记录使用次数
     *    **每次使用都加载该配置文件，并先判断已使用次数
     *    **每次使用完使用次数加1，写入配置文件
     * @throws IOException
     */
    public static void useProp() throws IOException {
        //定义Properties，用来和IO流结合
        Properties prop = new Properties();
        //配置文件
        File file = new File("G:\\test\\time.ini");
        if(!file.exists()) {
            //如果文件不存在则创建文件(用于第一次使用时创建文件)
            file.createNewFile();
        }
        //定义字节读取流，读取配置文件中记录的使用次数
        FileInputStream fis = new FileInputStream(file);
        //载入流，以获取文件中配置的键值对
        prop.load(fis);
        //定义使用次数
        int count = 0;
        //通过键获取值
        String countValue = prop.getProperty("time");
        //第一次时countValue为null
        if(countValue!=null){
            //将字符串次数变成数字次数
            count = Integer.parseInt(countValue);
            if(count>3){
                System.out.println("您使用次数已到，继续使用请注册！");
                return;
            }
        }
        //如果使用次数未到则次数加1
        count++;
        //配置新的键值对
        prop.setProperty("time", count+"");
        FileWriter fos = new FileWriter(file);
        //将新的键值对写入文件
        prop.store(fos, "这是应用程序使用次数的配置文件");
        fis.close();
        fos.close();
    }

    public static void write() throws IOException
    {
        OutputStreamWriter osw1 = new OutputStreamWriter(new FileOutputStream("gbk.txt"),"GBK");
        osw1.write("你好");
        osw1.close();

        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("utf-8.txt"),"UTF-8");
        osw2.write("你好");
        osw2.close();
    }
    public static void read() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("gbk.txt"),"GBK");
        char[] buf = new char[1024];
        int len = isr.read(buf);
        System.out.println(new String(buf,0,len));
    }

    public static void encodeTest() throws UnsupportedEncodingException {
        //编码解码1：默认编码
        String str1 = "你好";
        byte[] buf1 = str1.getBytes();//默认解码：Unicode，四个字节

        //编码解码2：指定编码
        String str2 = "你好";
        byte[] buf2 = str2.getBytes("UTF-8");//指定解码：UTF-8,六个字节


        //编码解码3：编码正确解码错误
        String str3 = "你好";
        byte[] buf3 = str3.getBytes("GBK");//指定编码：GBK,四个字节
        String str13 = new String(buf3,"ISO8859-1");//错误解码

        //编码解码4：错误编码正确解码
        String str4 = "你好";
        byte[] buf4 = str4.getBytes("ISO8859-1");//错误编码
        String str14 = new String(buf4,"GBK");//正确解码，读不出来

        //编码解码5：编码对了，但是解码错误了，怎么办呢？
        //此时可以将错误的解码再错编回去，载用正确编码解码
        String str5 = "你好";
        byte[] buf5 = str5.getBytes("GBK");//正确编码
        String str6 = new String(buf5,"ISO8859-1");//错误解码，读不出来
        byte[] buf6 = str6.getBytes("ISO8859-1");//再错误编码
        String str7 = new String(buf6,"GBK");//再正确解码，这样就可以读出来了
    }
    public static void main(String[] args) throws IOException {
        //show();
        //useProp();
        encodeTest();
    }
}
