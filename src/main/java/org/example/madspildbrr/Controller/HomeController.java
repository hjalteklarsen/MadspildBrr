package org.example.madspildbrr.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @GetMapping("/om")
    public String about(){
        return "home/om";
    }

    @GetMapping("/kontakt")
    public String kontakt(){
        return "home/kontakt";
    }

    /*@PostMapping("/submit")
    @ResponseBody
    public String handleFormSubmission(@RequestParam String name,
                                       @RequestParam String email,
                                       @RequestParam int participants) {
        emailService.sendConfirmation(email, name, participants);
        return "OK";
    }*/

}
