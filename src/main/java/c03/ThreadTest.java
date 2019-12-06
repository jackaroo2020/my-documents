package c03;

/**
 * @Description:  1. ���4���̣߳����������߳�ÿ�ζ�j����1�����������̶߳�jÿ�μ���1��д������
 * @Author: LT
 * @CreateDate: 2019/12/3 13:37
 * @Version: 1.0.0
 */
public class ThreadTest {

    private int j;

    /**
     * ����add������sub������synchronized�ؼ�������Ϊ�������߳�ͬʱ����ͬһ������ʱ��
     * �����Ǽ򵥵�j++����ʱ����ϵͳ�ײ�Ҳ��ͨ���������������ʵ�֣�������ִ��j++����Ҳ��Ҫ�ķ�ʱ�䣬
     * ��ʱ���п�����ִ��j++��ʱ������һ���߳�H�ͻ��j���в������������һ���߳�H���ܲ����Ŀ��ܾ�
     * �������µ�ֵ�ˡ����Ҫ�ṩ�߳�ͬ����
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
