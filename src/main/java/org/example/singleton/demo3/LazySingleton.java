package org.example.singleton.demo3;

import org.example.singleton.demo2.Singleton;

public class LazySingleton {
    private LazySingleton(){}

    private static LazySingleton instance;

    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
