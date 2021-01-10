package com.testThread;

/**
 * @author wangquan
 * @date 2021/1/10
 */
public class ThreadLoaclDemo1 {
    private static final ThreadLocal<String> content = new ThreadLocal<>();
    private static String name;

    public void setContent(String v){
        content.set(v);
    }

    public String getContent(){
        return content.get();
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    //content.set(Thread.currentThread().getName() +": 的数据。。");
                    name = Thread.currentThread().getName() +": 的数据。。";
                    System.out.println("=======================");
                    //System.out.println(Thread.currentThread().getName() + ": " +content.get());
                    System.out.println(Thread.currentThread().getName() + ": " +name);
                }
            }).start();
        }
    }
}
