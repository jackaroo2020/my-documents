package c01.thread;

/**
 * @Description: java����������
 * @Author: LT
 * @CreateDate: 2019/12/3 15:42
 * @Version: 1.0.0
 */
public class ThreadTest {

    public static void main(String[] args) {
        // ��ʽһ
        ThreadDemo01 threadDemo01 = new ThreadDemo01();
        threadDemo01.setName("�߳�1");
        threadDemo01.start();

        // ��ʽ��
        ThreadDemo02 threadDemo02 = new ThreadDemo02();
        Thread thread = new Thread(threadDemo02);
        thread.setName("�߳�2");
        thread.start();
    }
}
