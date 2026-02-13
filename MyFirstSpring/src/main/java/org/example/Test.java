package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
        //Movie m=new Movie();
        Movie m1=context.getBean("Movie1", Movie.class);
        m1.setTitle("Toy");
        System.out.println(m1.getTitle());

        Movie m2=context.getBean("Movie2", Movie.class);
        m2.setTitle("Book");
        System.out.println(m2.getTitle());

        Car c1=context.getBean("Car1", Car.class);
        c1.setName("Benz");
        System.out.println(c1.getName());

        Car c2=context.getBean("Car2", Car.class);
        c2.setName("BMW");
        System.out.println(c2.getName());

        Book b1=context.getBean(Book.class);
    }
}
