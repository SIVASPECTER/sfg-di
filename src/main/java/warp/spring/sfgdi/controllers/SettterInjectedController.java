package warp.spring.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import warp.spring.sfgdi.services.GreetingService;

@Controller
public class SettterInjectedController {


    private GreetingService greetingService;

    @Qualifier("settterGreetingServiceImpl")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return  greetingService.sayGreeting();
    }
}
