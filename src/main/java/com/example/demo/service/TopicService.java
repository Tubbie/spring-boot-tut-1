package com.example.demo.service;

import com.example.demo.model.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
            new Topic("spring", "Spring Boot", "Spring"),
            new Topic("java", "Java SE", "Java"),
            new Topic("javascript", "Javascript", "Javascript")
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }
}
