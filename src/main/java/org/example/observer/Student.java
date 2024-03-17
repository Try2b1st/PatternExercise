package org.example.observer;

public class Student implements Observer{
    private String name;
    private String schoolNumber;

    private int clock = 0;

    public Student(String name, String schoolNumber) {
        this.name = name;
        this.schoolNumber = schoolNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(String schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    @Override
    public void update(int hour) {
        clock = hour;
        System.out.println(this.name + ", " + this.clock + ":00");
    }
}
