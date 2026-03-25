package com.oop.ExtendsTest5;

/**
 * @author 郝启航
 */
public class ProfessionalTeacher extends Teacher {
    private String subject;

    public ProfessionalTeacher(String subject) {
        this.subject = subject;
    }

    public ProfessionalTeacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public ProfessionalTeacher() {
    }

    public String getSubject() {
        return subject;
    }


    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void teach() {
        System.out.println("教"+ subject+"课知识");
    }
}
