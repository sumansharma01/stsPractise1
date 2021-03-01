package com.example.demo.Controllers;

import com.example.demo.Topics;
import com.example.demo.TopicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class Topic {


    @Autowired
    private TopicsService topicsService;

    @RequestMapping("/topics")
    public List<Topics> getAllTopics(){
        return topicsService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topics getTopic(@PathVariable String id){
        return topicsService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopic(@RequestBody Topics topic){
        topicsService.addTopic(topic);
    }


}
