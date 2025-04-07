package org.example.madspildbrr.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index()
    {
        return "home/index";
    }

    @GetMapping("/event")
    public String event(){
        return "home/event";
    }

    @GetMapping("/om")
    public String om(){
        return "home/om";
    }

    @GetMapping("/raffle")
    public String raffle(){
        return "home/raffle";
    }

    @GetMapping("/kontakt")
    public String kontakt(){
        return "home/kontakt";
    }

    @GetMapping("/login")
    public String login(){
        return "home/login";
    }

    @GetMapping("/opret")
    public String opret(){
        return "home/opret";
    }
}
