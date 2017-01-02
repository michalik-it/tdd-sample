package it.michalik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kamil on 31/12/2016.
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public String homePage() {
        System.out.println("Main");
        return "index.html";
    }

}
