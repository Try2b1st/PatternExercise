package org.example.singleton.demo4;

public class Test {
    public static void main(String[] args) {
        DoubleCheckSingleton doubleCheckSingleton1 = DoubleCheckSingleton.getInstance();

        DoubleCheckSingleton doubleCheckSingleton2 = DoubleCheckSingleton.getInstance();


        System.out.println(doubleCheckSingleton1 == doubleCheckSingleton2);
    }
}
