package com.bootcoding.java.opps.encapsulation.studentresult;

import com.bootcoding.java.opps.encapsulation.studentresult.result.Result;
import com.bootcoding.java.opps.encapsulation.studentresult.student.Student;

public class ResultApp {
    public static void main(String[] args){
        //Creating an object of Result class
        Result result = new Result();

        //Create an object student1 for Student class
        Student student1 = new Student();
        //Setting value of student1
        student1.setRollNo(101);
        student1.setName("Aman");
        student1.setStandard(8);
        student1.marks[0] = 50;
        student1.marks[1] = 57;
        student1.marks[2] = 68;
        student1.marks[3] = 56;
        student1.marks[4] = 70;
        result.setPercentage(result.calPercentage(student1.marks));
        result.setIsPass(result.displayResult());
        student1.studentResult = result;

        //Getting value of student1
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Roll Number: " + student1.getRollNo());
        System.out.println("Standard: " + student1.getStandard());
        System.out.println("Result status: " + student1.studentResult.getIsPass());
        System.out.println("Percentage: " + student1.studentResult.getPercentage());
        System.out.println();

        //Create an object student2 for Student class
        Student student2 = new Student();
        //Setting value of student2
        student2.setRollNo(102);
        student2.setName("Darshan");
        student2.setStandard(8);
        student2.marks[0] = 6;
        student2.marks[1] = 6;
        student2.marks[2] = 7;
        student2.marks[3] = 6;
        student2.marks[4] = 8;
        result.setPercentage(result.calPercentage(student2.marks));
        result.setIsPass(result.displayResult());
        student2.studentResult = result;

        //Getting value of student2
        System.out.println("Student Name: " + student2.getName());
        System.out.println("Student Roll Number: " + student2.getRollNo());
        System.out.println("Standard: " + student2.getStandard());
        System.out.println("Result status: " + student2.studentResult.getIsPass());
        System.out.println("Percentage: " + student2.studentResult.getPercentage());
        System.out.println();
    }
}
