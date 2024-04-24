package com.SpringBoot_Intro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootIntroApplication {

	public static void main(String[] args) {
		 /*normal way of creating object by me
        Mohan obj=new Mohan();
        obj.print();
         */

		//I want Spring to create the object
        /*
        1. Spring creates an object inside container present inside JVM
        2. we can reach that container using Application context to get that object
        3. Using SpringApplication.run method, we can get object context.
         */
		ApplicationContext context=SpringApplication.run(SpringBootIntroApplication.class, args);
		Mohan obj1=context.getBean(Mohan.class);
		obj1.print();
		//now will our IoC container gives our object?
        /*
        ans: no
        object is not present in IoC container
        why?
        if our code has 100 classes and Spring byh default will say I will not create any object for you
        you have to mention when you want the object by using Component annotation on top of that class.
         */

		Mohan obj2=context.getBean(Mohan.class);
		obj2.print();
		obj2.code();

	}

}
