package com.aiedu.AIedu;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {

    private ChatService chatService;
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @GetMapping("/main")
    public String main() {
//        model.addAttribute("name", name);
        return "main";
    }
    @GetMapping("/coding/python")
    public String basicpython() {
        return "coding_python";
    }
    @GetMapping("/english/grammar/basic")
    public String basicgrammar() {
        return "grammar_basic";
    }


}