package org.example.iterator;

import java.util.ArrayList;

public class StudentCollection implements MyCollection{
    private ArrayList<Student> arrayList;

    public StudentCollection() {
        arrayList = new ArrayList<>();
    }

    public void add(Student student){
        arrayList.add(student);
    }

    @Override
    public IteratorAble<Student> getIterator() {
        return new StudentIterator(arrayList);
    }
}
