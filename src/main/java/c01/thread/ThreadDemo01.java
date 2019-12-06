package c01.thread;

/**
 * @Description: javaÀà×÷ÓÃÃèÊö
 * @Author: LT
 * @CreateDate: 2019/12/3 15:40
 * @Version: 1.0.0
 */
public class ThreadDemo01 extends Thread{
    /**
     * If this thread was constructed using a separate
     * <code>Runnable</code> run object, then that
     * <code>Runnable</code> object's <code>run</code> method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of <code>Thread</code> should override this method.
     *
     * @see #start()
     * @see #stop()
     * @see #Thread(ThreadGroup, Runnable, String)
     */
    @Override
    public void run() {
        System.out.println(this.getName()+" ---------------->extends Thread");
    }

}
