package org.example.singleton.demo8;

import java.io.Serializable;

public class LazySingleton implements Serializable {

    private static Boolean flag = false;

    private LazySingleton() {
        synchronized (LazySingleton.class) {
            if (flag) {
                throw new RuntimeException("不能创建多该对象实例");
            }
            flag = true;
        }
    }

    //静态内部类
    private static class SingletonHolder {
        private static final LazySingleton INSTANCE = new LazySingleton();
    }

    public static LazySingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}