package com.cy.cyaiagent.app;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class PracticeAppTest {

    @Resource
    PracticeApp practiceApp;

    @Test
    void testChat() {
        String chatId= UUID.randomUUID().toString();
        String message="你好，我叫cc";
        String answer= practiceApp.doChat(message,chatId);
        Assertions.assertNotNull(answer);


        message="你叫什么名字";
        answer= practiceApp.doChat(message,chatId);
        Assertions.assertNotNull(answer);


        message="我叫什么名字";
        answer= practiceApp.doChat(message,chatId);
        Assertions.assertNotNull(answer);


    }

    @Test
    void doChatWithRag() {

        String chatId = UUID.randomUUID().toString();
        String message = "HTTP方法中的GET匹配的语意是什么";
        String answer = practiceApp.doChatWithRag(message, chatId);
        Assertions.assertNotNull(answer);
    }
}