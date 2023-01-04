package warp.spring.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SettterGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World From * SETTER Greeting Service * :";
    }
}
