package c01.thread;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/12/3 15:42
 * @Version: 1.0.0
 */
public class ThreadTest {

    public static void main(String[] args) {
        // 方式一
        ThreadDemo01 threadDemo01 = new ThreadDemo01();
        threadDemo01.setName("线程1");
        threadDemo01.start();

        // 方式二
        ThreadDemo02 threadDemo02 = new ThreadDemo02();
        Thread thread = new Thread(threadDemo02);
        thread.setName("线程2");
        thread.start();
    }
}
