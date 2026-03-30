package com.cy.cyaiagent.rag;

import jakarta.annotation.Resource;
import org.springframework.ai.document.Document;
import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.ai.vectorstore.SimpleVectorStore;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;


@Configuration
public class PracticeAppVectorStoreConfig {

    @Resource
    private PracticeAppDocumentLoader practiceAppDocumentLoader;

    @Bean
    VectorStore practiceAppVectorStore(EmbeddingModel dashscopeEmbeddingModel) {
        SimpleVectorStore simpleVectorStore = SimpleVectorStore.builder(dashscopeEmbeddingModel)
                .build();
        // 加载文档
        List<Document> documents = practiceAppDocumentLoader.getDocuments();
        simpleVectorStore.add(documents);
        return simpleVectorStore;
    }
}

