package pro.edu.greeting.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/hello")
    String showGreetings(){
        return "Greetings from RestController";
    }

}
