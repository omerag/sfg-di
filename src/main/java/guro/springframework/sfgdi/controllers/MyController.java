package guro.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by omer on 25-Oct-20.
 */

@Controller
public class MyController {

    public String sayHello(){

        System.out.println("Hello world!!");

        return "Hi Folks!";
    }
}
