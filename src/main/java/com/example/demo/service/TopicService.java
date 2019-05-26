package com.example.demo.service;

import com.example.demo.model.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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

    public Topic getTopicById(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public Topic createTopic(Topic topic) {
        topics.add(topic);
        return getTopicById(topic.getId());
    }

    public Topic updateTopic(String id, Topic topic) {

        for (Iterator<Topic> i = topics.iterator(); i.hasNext(); ) {
            Topic item = i.next();
            if (item.getId().equals(topic.getId())) {
                item.setDescription(topic.getDescription());
                item.setName(topic.getName());
                break;
            }
        }
        return getTopicById(id);
    }

    public void removeTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}
