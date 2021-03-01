package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicsService {
    List<Topics> topics=new ArrayList<>( Arrays.asList(
            new Topics("spring","Spring Framework","Spring description"),
            new Topics("java","java Framework","java description"),
            new Topics("js","js Framework","js description"),
            new Topics("maths","maths Framework","maths description")
    ));

    public List<Topics> getAllTopics(){
        return topics;
    }

    public Topics getTopic(String id){
        return topics.stream().filter(x->x.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topics topic){
        topics.add(topic);
    }
}
