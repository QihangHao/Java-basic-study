package com.oop.ExtendsTest5;

/**
 * @author 郝启航
 */
public class Test {
    static void main() {
        UndergraduateStudents us = new UndergraduateStudents("张三", 18, "软件工程");
        us.study();
        Postgraduate pg = new Postgraduate("王五", 19, "计算机技术");
        pg.study();
        pg.sleep();
        GeneralTeacher gt = new GeneralTeacher("小王", 18);
        gt.teach();
        ProfessionalTeacher pt = new ProfessionalTeacher("小李", 19, "软件工程");
        pt.teach();
    }
}
