package com.oop.ExtendsTest5;

/**
 * @author 郝启航
 */
public class UndergraduateStudents extends  Students{
    public UndergraduateStudents() {
    }

    public UndergraduateStudents(String name, int age, String gared) {
        super(name, age, gared);
    }

    public UndergraduateStudents(String gared) {
        super(gared);
    }

    @Override
    public void study() {
        System.out.println("攻读学士学位");
    }
}
