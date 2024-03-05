package org.example.singleton.demo7;

import java.io.*;

/**
 * 序列化和反序列化破坏单例模式
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeObjectFormFile();
        readObjectFormFile();
        readObjectFormFile();
    }

    public static void readObjectFormFile() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("E:\\Pattern\\PatternExercise\\src\\main\\java\\org\\example\\singleton\\demo7\\a.txt"));
        LazySingleton lazySingleton = (LazySingleton) objectInputStream.readObject();
        System.out.println(lazySingleton);
        objectInputStream.close();
    }

    public static void writeObjectFormFile() throws IOException {
        Object object = LazySingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("E:\\Pattern\\PatternExercise\\src\\main\\java\\org\\example\\singleton\\demo7\\a.txt"));
        objectOutputStream.writeObject(object);
        objectOutputStream.close();
    }
}
