package com.oop.PolymorphicTest001;

/**
 * @author 郝启航
 */
public class Test {
    static void main() {
        Admin admin = new Admin("张三", 123, 12345678);
        Students students = new Students("小王", 123, 12345678);
        Teacher teacher = new Teacher("小李", 123, 12345678);
        StudentManagementSystem.register(admin);
        StudentManagementSystem.register(students);
        StudentManagementSystem.register(teacher);
    }
}
