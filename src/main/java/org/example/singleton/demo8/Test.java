package org.example.singleton.demo8;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射破坏单例模式
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        LazySingleton lazySingleton1 = LazySingleton.getInstance();

        //获取字节码对象
        Class<LazySingleton> lazySingletonClass = LazySingleton.class;

        //获取构造方法
         Constructor<LazySingleton> declaredConstructor = lazySingletonClass.getDeclaredConstructor();

         //取消访问权限
        declaredConstructor.setAccessible(true);

        LazySingleton lazySingleton2 = (LazySingleton) declaredConstructor.newInstance();
        System.out.println(lazySingleton1);
        System.out.println(lazySingleton2);
    }
}
