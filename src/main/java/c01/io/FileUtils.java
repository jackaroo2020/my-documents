package c01.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.util.ArrayList;

/**
 * @Description: File�ೣ������
 * @Author: LT
 * @CreateDate: 2019/12/6 11:28
 * @Version: 1.0.0
 */
public class FileUtils {

    private FileUtils () {
    }


    /**
     * (1)�ļ�������:�г�����Ŀ¼������.txt�ļ�
     *
     * @param file
     */
    public static String[] showFileNames(File file) {

       String[] names = file.list(new FilenameFilter() {
           public boolean accept(File dir, String name) {
               return name.endsWith(".txt");
           }
       });
        return names;
    }

    /**
     * �г�ָ��Ŀ¼�µ������ļ����ļ���(�ݹ�)
     * ������εݹ�
     * @param dir
     */
    public static  void showDir(File dir) {
        File[] files = dir.listFiles();

        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory() && !files[i].isHidden()) {
               showDir(files[i]);
            } else {
                System.out.println(files[i]);
            }
        }
    }

    /**
     * ɾ�������ݵ�Ŀ¼
     *
     * @param dir
     */
    public static void removeDir(File dir) {
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory() && !files[i].isHidden()) {
                removeDir(files[i]);
            } else {
                System.out.println(files[i].toString()+files[i].delete());
            }
        }
        System.out.println(dir+"::"+dir.delete());
    }

    /**
     * )���󣺽��ƶ�Ŀ¼�µ�java�ļ��ľ���·���洢���ı��ļ��С�
     * 	   ˼·��
     * 	   **��ָ��Ŀ¼���еݹ�
     * 	   **��ȡ�ݹ����������java�ļ���·��
     * 	   **����Щ·���洢��������
     * 	   **�������е�����д���ļ���
     */

    //��ָ��Ŀ¼���еݹ鲢������Java�ļ��洢��������
    public static void getFileName(File file,ArrayList<File> arraylist){
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if(files[i].isDirectory()&&!files[i].isHidden()){
                getFileName(files[i],arraylist);
            }else{
                if(files[i].getName().endsWith(".java")){
                    arraylist.add(files[i]);
                }
            }
        }
    }
    //���������������ݴ洢�����ļ���
    public static void saveFileToNewDir(ArrayList<File> arraylist, File newDir){
        BufferedWriter bufw = null;
        try {
            bufw = new BufferedWriter(new FileWriter(newDir));
            for (File file : arraylist) {
                String fileAbsolutePath = file.getAbsolutePath();
                bufw.write(fileAbsolutePath);
                bufw.newLine();
                bufw.flush();
            }
        } catch (Exception e) {
            System.out.println("�ļ�д��ʧ��");
        }finally{
            try {
                if(bufw!=null) {
                    bufw.close();
                }
            } catch (Exception e2) {
                System.out.println("�ļ�д�����ر�ʧ��");
            }
        }
    }

    public static void main(String[] args) {
        //String[] names = showFileNames(new File("G:\\"));
        //for (int i = 0; i < names.length; i++) {
        //    System.out.println(names[i]);
        //}
        // �г��ļ�
        //showDir(new File("G:\\"));
        //removeDir(new File("G:\\test"));
    }


}
