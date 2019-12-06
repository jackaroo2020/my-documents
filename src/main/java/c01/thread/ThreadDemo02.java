package c01.thread;

/**
 * @Description: javaÀà×÷ÓÃÃèÊö
 * @Author: LT
 * @CreateDate: 2019/12/3 15:43
 * @Version: 1.0.0
 */
public class ThreadDemo02 implements Runnable {

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-----------implements Runnable");
    }
}
