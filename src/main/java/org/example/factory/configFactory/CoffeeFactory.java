package org.example.factory.configFactory;

import org.example.Main;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.*;
import java.util.logging.Logger;

public class CoffeeFactory {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    private static HashMap<String, Coffee> hashMap = new HashMap<>();

    //静态代码块加载配置文件，只加载一次
    static {
        Properties properties = new Properties();

        InputStream inputStream = CoffeeFactory.class.getClassLoader().getResourceAsStream("config.properties");
        try {
            properties.load(inputStream);
            //获取类名
            Set<Object> keys = properties.keySet();

            //反射创建对象
            for (Object o : keys) {
                String className = properties.getProperty((String) o);

                Class<?> clazz = Class.forName(className);
                Constructor<?> constructor = clazz.getDeclaredConstructor();
                Coffee coffee = (Coffee) constructor.newInstance();
                hashMap.put((String) o, coffee);
            }
        } catch (Exception e) {
            logger.severe(e.getMessage());
        }
    }

    public Coffee getCoffeeByName(String s) {
        return hashMap.get(s);
    }
}
