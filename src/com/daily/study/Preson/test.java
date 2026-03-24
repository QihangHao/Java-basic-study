package com.daily.study.Preson;

/**
 * @author 郝启航
 */
public class test {
    static void main() {
        Students s = new Students(18,"男","小王","一年级");
        s.show();
        s.study();
        Teacher t = new Teacher(19,"男","小李","数学");
        t.show();
        t.teach();
    }
}
