package com.oop.ExtendsTest5;

/**
 * @author 郝启航
 */
public class Students extends Person{
    private String gared;

    public Students() {
    }

    public Students(String name, int age, String gared) {
        super(name, age);
        this.gared = gared;
    }
    public void study(){
        System.out.println("学生正在学习");
    }

    public String getGared() {
        return gared;
    }

    public void setGared(String gared) {
        this.gared = gared;
    }

    public Students(String gared) {
        this.gared = gared;
    }
}
