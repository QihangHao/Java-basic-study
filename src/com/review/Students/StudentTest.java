package com.review.Students;

/**
 * @author 郝启航
 */
public class StudentTest {
    public static void main(String[] args) {
        Student.schoolName = "北京大学";
        Student s1 = new Student("孙悟空",18);
        Student s2 =new Student("小月",19);
        s1.show();
        s2.show();
        Student.schoolName = "清华大学";
        s1.show();
        s2.show();


    }
}
