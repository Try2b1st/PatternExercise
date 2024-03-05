package org.example.singleton.jdkTest;

import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();

        Process process = runtime.exec("ipconfig");

        InputStream inputStream = process.getInputStream();

        byte[] arr = new byte[1024 * 1024 * 100];

        int len = inputStream.read(arr);

        String s = new String(arr, 0, len, "GBK");

        System.out.println(s);
    }
}
