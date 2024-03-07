package org.example.builder.demo2;

public class Test {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .mainBoard("hhh")
                .screen("ss")
                .memory("jsd")
                .build();

        System.out.println(phone);
    }
}
