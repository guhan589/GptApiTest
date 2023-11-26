package com.example.demo.controller;

import com.example.demo.dto.ChatGptResponseDto;
import com.example.demo.dto.QuestionRequestDto;
import com.example.demo.service.ChatGptService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
@RequestMapping("/chat-gpt")
public class openAIController {

    private final ChatGptService chatGptService;

    public openAIController(ChatGptService chatGptService) {
        this.chatGptService = chatGptService;
    }

    @PostMapping("/question")
    public ChatGptResponseDto sendQuestion(@RequestBody QuestionRequestDto requestDto) {
        System.out.println("requestDto = " + requestDto);
        return chatGptService.askQuestion(requestDto);
    }
}