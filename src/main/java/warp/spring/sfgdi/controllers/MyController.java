package warp.spring.sfgdi.controllers;


import org.springframework.stereotype.Controller;
import warp.spring.sfgdi.services.GreetingService;

@Controller
public class MyController {

    private  final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String  getGreeting(){
        return greetingService.sayGreeting();
    }

    public String sayHello(){
        //System.out.println("Hello World!");

        return "Hi Folks!";
    }


}
