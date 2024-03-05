package org.example.singleton.demo5;

public class LazySingleton {

    private LazySingleton(){

    }

    //静态内部类
    private static class SingletonHolder{
        private static final LazySingleton INSTANCE= new LazySingleton();
    }

    public static LazySingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
