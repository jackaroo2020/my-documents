package c03;

/**
 * @Description:  1. 设计4个线程，其中两个线程每次对j增加1，另外两个线程对j每次减少1。写出程序。
 * @Author: LT
 * @CreateDate: 2019/12/3 13:37
 * @Version: 1.0.0
 */
public class ThreadTest {

    private int j;

    /**
     * 这里add方法和sub方法加synchronized关键字是因为当两个线程同时操作同一个变量时，
     * 就算是简单的j++操作时，在系统底层也是通过多条机器语句来实现，所以在执行j++过程也是要耗费时间，
     * 这时就有可能在执行j++的时候，另外一个线程H就会对j进行操作，因此另外一个线程H可能操作的可能就
     * 不是最新的值了。因此要提供线程同步。
     */
    private synchronized void add() {
        j++;
        System.out.println(Thread.currentThread().getName()+":"+j);
    }

    private synchronized void sub() {
        j--;
        System.out.println(Thread.currentThread().getName()+":"+j);
    }

    class Add implements Runnable {

        /**
         * @see Thread#run()
         */
        public void run() {
            for (int i = 0; i < 100; i++) {
                add();
            }
        }
    }

    class Sub implements Runnable {

        /**
         * @see Thread#run()
         */
        public void run() {
            for (int i = 0; i < 100; i++) {
                sub();
            }
        }
    }

    public static void main(String[] args) {
        ThreadTest t = new ThreadTest();

        Add add = t.new Add();
        Sub sub = t.new Sub();

        for (int i = 0; i < 2; i++) {
            Thread threadAdd = new Thread(add);
            threadAdd.setName("add-->");
            threadAdd.start();

            Thread threadSub = new Thread(sub);
            threadSub.setName("sub-->");
            threadSub.start();
        }
    }


}
