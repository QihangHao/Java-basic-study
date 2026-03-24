package com.daily.study.Preson;

/**
 * @author 郝启航
 */
public class  Students extends Person {
    String gard;

    public Students() {

    }

    public Students(int age, String sex, String name, String gard) {
        super(age, sex, name);
        this.gard = gard;
    }

    public String getGard() {
        return gard;
    }

    public void setGard(String gard) {
        this.gard = gard;
    }

    public void study(){
        System.out.println("学习");
    }
    public void show(){
        System.out.println("姓名："+name+"  性别："+sex+"  年龄："+age+"  班级："+gard);
    }

}
