package com.cy.cyaiagent.rag;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class PracticeAppDocumentLoaderTest {

    @Resource
    PracticeAppDocumentLoader practiceAppDocumentLoader;

    @Test
    void getDocuments() {
        practiceAppDocumentLoader.getDocuments();
    }
}