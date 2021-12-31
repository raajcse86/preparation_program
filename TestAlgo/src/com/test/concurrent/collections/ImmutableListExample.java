package com.test.concurrent.collections;

import java.util.List;

class Student
{
    int rollNo;
    String className;
    String name;
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Student(int rollNo, String className, String name) {
        this.rollNo = rollNo;
        this.className = className;
        this.name = name;
    }
}
public class ImmutableListExample
{
    public static void main(String[] args)
    {
        Student student1 = new Student(1, "MCA", "Ravi");
        Student student2 = new Student(2, "BCA", "Ram");
        Student student3 = new Student(3, "BCA", "Ravi");

        //creating list by using of() method
        List<Student> immutableList = List.of(student1, student2, student3);

        for(Student s : immutableList)
        {
            System.out.println("Rollno :" + s.getRollNo());
            System.out.println("Class Name :" + s.getClassName());
            System.out.println("Name :" + s.getName());
        }

        // Changing the class Name of rollno 2
        immutableList.get(1).setClassName("MCA");

        System.out.println("After make chnges of Rollno 2: "+ immutableList.get(1).getClassName());
    }
}
