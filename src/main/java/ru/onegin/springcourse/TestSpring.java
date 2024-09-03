package ru.onegin.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author onegines
 * @date 30.08.2024
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        context.close();
    }
}
