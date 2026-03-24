package com.daily.study.Preson;

/**
 * @author 郝启航
 */
public class Teacher extends Person {
    String subject;

    public Teacher() {
    }

    public Teacher(String subject) {
        this.subject = subject;
    }

    public Teacher(int age, String sex, String name, String subject) {
        super(age, sex, name);
        this.subject = subject;
    }

    public void teach() {
        System.out.println("老师正在教" + subject);
    }
    public void show(){
        System.out.println(name+"老师"+age+"岁");
    }
}
