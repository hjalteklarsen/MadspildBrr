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

    @GetMapping("/erhverv")
    public String erhverv(){
        return "home/erhverv";
    }

    @GetMapping("/event")
    public String event(){
        return "home/erhverv/event";
    }

    @GetMapping("/privat")
    public String privat(){
        return "home/privat";
    }

    @GetMapping("/om")
    public String om(){
        return "home/om";
    }

    @GetMapping("/raffle")
    public String raffle(){
        return "home/privat/raffle";
    }

    @GetMapping("/kontakt")
    public String kontakt(){
        return "home/kontakt";
    }


}
