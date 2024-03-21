package org.example.iterator;

import java.util.List;

public class StudentIterator implements IteratorAble<Student>{

    private List<Student> studentList;
    private int currentIndex = 0;

    public StudentIterator(List<Student> studentList){
        this.studentList = studentList;
    }
    @Override
    public Boolean hasNext() {
        return currentIndex < studentList.size();
    }

    @Override
    public Student next() {
        if(hasNext()){
            Student student = studentList.get(currentIndex);
            currentIndex++;
            return student;
        }
        return null;
    }
}
