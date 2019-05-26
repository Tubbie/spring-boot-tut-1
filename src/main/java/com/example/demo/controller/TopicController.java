package com.example.demo.controller;

import com.example.demo.model.Topic;
import com.example.demo.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

//    @RequestMapping("/topics/{id}")
//    public List<Topic> createTopic(String id){
//    }
//
//    @RequestMapping("/topics/{id}")
//    public List<Topic> getTopicById(String id){
//    }
//
//    @RequestMapping("/topics/{id}")
//    public List<Topic> updateTopicById(String id){
//    }
//
//    @RequestMapping("/topics/{id}")
//    public List<Topic> deleteTopicById(String id){
//    }
}
