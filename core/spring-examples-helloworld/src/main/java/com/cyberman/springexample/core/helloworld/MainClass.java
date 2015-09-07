package com.cyberman.springexample.core.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This is the main class that will be executed to run spring framework.
 *
 * Created by cybermen on 27/08/15.
 */
public class MainClass {

  public static void main(String[] args) {
    //This load the configuration from the file (This is the spring configuration file)
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "spring-config.xml"
    );

    //This calls a new instance of person class (the person is referenced in the spring configuration file) and will be initialized by the values putted in the configuration.
    Person person = (Person) context.getBean("person");
    System.out.println(person);
  }

}
