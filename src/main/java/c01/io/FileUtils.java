package c01.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.util.ArrayList;

/**
 * @Description: File类常见需求
 * @Author: LT
 * @CreateDate: 2019/12/6 11:28
 * @Version: 1.0.0
 */
public class FileUtils {

    private FileUtils () {
    }


    /**
     * (1)文件名过滤:列出给定目录的所有.txt文件
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
     * 列出指定目录下的所有文件和文件夹(递归)
     * 不带层次递归
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
     * 删除带内容的目录
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
     * )需求：将制定目录下的java文件的绝对路径存储到文本文件中。
     * 	   思路：
     * 	   **对指定目录进行递归
     * 	   **获取递归过程中所有java文件的路径
     * 	   **将这些路径存储到集合中
     * 	   **将集合中的数据写入文件中
     */

    //对指定目录进行递归并将所以Java文件存储到集合中
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
    //将集合中所有数据存储到新文件中
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
            System.out.println("文件写入失败");
        }finally{
            try {
                if(bufw!=null) {
                    bufw.close();
                }
            } catch (Exception e2) {
                System.out.println("文件写入流关闭失败");
            }
        }
    }

    public static void main(String[] args) {
        //String[] names = showFileNames(new File("G:\\"));
        //for (int i = 0; i < names.length; i++) {
        //    System.out.println(names[i]);
        //}
        // 列出文件
        //showDir(new File("G:\\"));
        //removeDir(new File("G:\\test"));
    }


}
