package org.example.singleton.demo4;

public class DoubleCheckSingleton {
    private DoubleCheckSingleton(){}

    // 使用 volatile 关键字确保 instance 在所有线程中同步
    private static volatile DoubleCheckSingleton instance;

    public static DoubleCheckSingleton getInstance(){
        if(instance == null){
            synchronized (DoubleCheckSingleton.class){
                if(instance == null){
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
