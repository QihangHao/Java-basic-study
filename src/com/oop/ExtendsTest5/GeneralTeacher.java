package com.oop.ExtendsTest5;

/**
 * @author 郝启航
 */
public class GeneralTeacher extends Teacher{
    public GeneralTeacher() {
    }

    public GeneralTeacher(String name, int age) {
        super(name, age);
    }
    @Override
    public void teach(){
        System.out.println("老师正在教普通课程");
    }
}
