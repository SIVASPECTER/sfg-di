package warp.spring.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import warp.spring.sfgdi.services.PropertyGreetingServiceImpl;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;
    SettterInjectedController setterInjectedController;
    ConstructorInjectedController constructorInjectedController;
    @BeforeEach
    void setUp() {
          controller = new PropertyInjectedController();
          controller.greetingService = new PropertyGreetingServiceImpl();

          setterInjectedController = new SettterInjectedController();
          setterInjectedController.setGreetingService(new PropertyGreetingServiceImpl());


          constructorInjectedController = new ConstructorInjectedController(new PropertyGreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }

    @Test
    void setterGreeting(){
        System.out.println(setterInjectedController.getGreeting());
    }

    @Test
    void constructorGreeting(){
        System.out.println(constructorInjectedController.getGreeting());
    }

}