package org.example.singleton.demo7;

import java.io.Serializable;

public class LazySingleton implements Serializable {

    private LazySingleton(){

    }

    //静态内部类
    private static class SingletonHolder{
        private static final LazySingleton INSTANCE= new LazySingleton();
    }

    public static LazySingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

    public Object readResolve(){
        return SingletonHolder.INSTANCE;
    }
}