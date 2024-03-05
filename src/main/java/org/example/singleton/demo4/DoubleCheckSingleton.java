package org.example.singleton.demo4;

public class DoubleCheckSingleton {
    private DoubleCheckSingleton(){}

    private static DoubleCheckSingleton instance;

    public DoubleCheckSingleton getInstance(){
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
