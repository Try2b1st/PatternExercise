package org.example.iterator;

public class Client {
    public static void main(String[] args) {
        Student studentA = new Student("aaaa");
        Student studentB = new Student("bbbb");
        Student studentC = new Student("cccc");

        StudentCollection studentCollection = new StudentCollection();
        studentCollection.add(studentA);
        studentCollection.add(studentB);
        studentCollection.add(studentC);

        IteratorAble<Student> iterator = studentCollection.getIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
