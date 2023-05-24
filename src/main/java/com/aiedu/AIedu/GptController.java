package com.aiedu.AIedu;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/vi")
public class GptController {

    private ChatService chatService;
    @PostMapping("/chat")
    public String chat(@RequestBody String message) {
        return chatService.sendMessage(message);
    }

}
