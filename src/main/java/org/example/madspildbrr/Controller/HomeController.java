package org.example.madspildbrr.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index()
    {
        return "home/raffle";
    }

    @GetMapping("/erhverv")
    public String erhverv(){
        return "home/erhverv";
    }

    @GetMapping("/privat")
    public String privat(){
        return "home/privat";
    }

    @GetMapping("/about")
    public String about(){
        return "/about";
    }


}
