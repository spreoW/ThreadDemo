package com.testThread;

/**
 * @author wangquan
 * @date 2021/1/10
 */
public class Profiler {

    // 第一次调用get的时候，用来赋初始值
    private static final ThreadLocal<Long> timeThreadLocal = new ThreadLocal<Long>(){
        @Override
        protected Long initialValue() {
            return System.currentTimeMillis();
        }
    };

    public static void begin(){
        timeThreadLocal.set(System.currentTimeMillis());
    }

    public static Long end(){
        return System.currentTimeMillis() - timeThreadLocal.get();
    }

    public static void main(String[] args) throws InterruptedException {
        Profiler.begin();
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + ": " + Profiler.end());
    }
}
