package c01.io;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * @Description: java����������
 * @Author: LT
 * @CreateDate: 2019/12/6 14:05
 * @Version: 1.0.0
 */
public class PropertiesDemo {

    public static void show()
    {
        Properties prop = new Properties();
        prop.setProperty("����","26");
        prop.setProperty("����","30");
        prop.setProperty("����","35");
        System.out.println(prop);
        String value = prop.getProperty("����");
        System.out.println(value);

        Set<String> keys = prop.stringPropertyNames();
        for(String key : keys)
        {
            System.out.println(key+":"+prop.getProperty(key));
        }
    }



    /**
     *  ���󣺼�¼Ӧ�ó����ʹ�ô��������ʹ�ô����ѵ�������ʾ�û�ע�ᡣ
     *     ˼·��
     *             **��һ��ʹ��ʱ����һ�������ļ����ڼ�¼ʹ�ô���
     *    **ÿ��ʹ�ö����ظ������ļ��������ж���ʹ�ô���
     *    **ÿ��ʹ����ʹ�ô�����1��д�������ļ�
     * @throws IOException
     */
    public static void useProp() throws IOException {
        //����Properties��������IO�����
        Properties prop = new Properties();
        //�����ļ�
        File file = new File("G:\\test\\time.ini");
        if(!file.exists()) {
            //����ļ��������򴴽��ļ�(���ڵ�һ��ʹ��ʱ�����ļ�)
            file.createNewFile();
        }
        //�����ֽڶ�ȡ������ȡ�����ļ��м�¼��ʹ�ô���
        FileInputStream fis = new FileInputStream(file);
        //���������Ի�ȡ�ļ������õļ�ֵ��
        prop.load(fis);
        //����ʹ�ô���
        int count = 0;
        //ͨ������ȡֵ
        String countValue = prop.getProperty("time");
        //��һ��ʱcountValueΪnull
        if(countValue!=null){
            //���ַ�������������ִ���
            count = Integer.parseInt(countValue);
            if(count>3){
                System.out.println("��ʹ�ô����ѵ�������ʹ����ע�ᣡ");
                return;
            }
        }
        //���ʹ�ô���δ���������1
        count++;
        //�����µļ�ֵ��
        prop.setProperty("time", count+"");
        FileWriter fos = new FileWriter(file);
        //���µļ�ֵ��д���ļ�
        prop.store(fos, "����Ӧ�ó���ʹ�ô����������ļ�");
        fis.close();
        fos.close();
    }

    public static void write() throws IOException
    {
        OutputStreamWriter osw1 = new OutputStreamWriter(new FileOutputStream("gbk.txt"),"GBK");
        osw1.write("���");
        osw1.close();

        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("utf-8.txt"),"UTF-8");
        osw2.write("���");
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
        //�������1��Ĭ�ϱ���
        String str1 = "���";
        byte[] buf1 = str1.getBytes();//Ĭ�Ͻ��룺Unicode���ĸ��ֽ�

        //�������2��ָ������
        String str2 = "���";
        byte[] buf2 = str2.getBytes("UTF-8");//ָ�����룺UTF-8,�����ֽ�


        //�������3��������ȷ�������
        String str3 = "���";
        byte[] buf3 = str3.getBytes("GBK");//ָ�����룺GBK,�ĸ��ֽ�
        String str13 = new String(buf3,"ISO8859-1");//�������

        //�������4�����������ȷ����
        String str4 = "���";
        byte[] buf4 = str4.getBytes("ISO8859-1");//�������
        String str14 = new String(buf4,"GBK");//��ȷ���룬��������

        //�������5��������ˣ����ǽ�������ˣ���ô���أ�
        //��ʱ���Խ�����Ľ����ٴ���ȥ��������ȷ�������
        String str5 = "���";
        byte[] buf5 = str5.getBytes("GBK");//��ȷ����
        String str6 = new String(buf5,"ISO8859-1");//������룬��������
        byte[] buf6 = str6.getBytes("ISO8859-1");//�ٴ������
        String str7 = new String(buf6,"GBK");//����ȷ���룬�����Ϳ��Զ�������
    }
    public static void main(String[] args) throws IOException {
        //show();
        //useProp();
        encodeTest();
    }
}
