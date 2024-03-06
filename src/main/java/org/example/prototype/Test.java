package org.example.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student();
        student.setName("张三");

        Citation citation = new Citation();
        citation.setStudent(student);
        citation.setName("三好学生奖状");

        Citation clone = citation.clone();
        clone.setName("进步奖");

        citation.show();
        clone.show();

        clone.getStudent().setName("李四");

        citation.show();
        clone.show();

    }
}
