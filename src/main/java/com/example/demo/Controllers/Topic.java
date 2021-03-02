package com.example.demo.Controllers;

import com.example.demo.Topics;
import com.example.demo.TopicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Topic {


    @Autowired
    private TopicsService topicsService;

    @RequestMapping("/topics")
    public List<Topics> getAllTopics(){
        return topicsService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Optional<Topics> getTopic(@PathVariable String id){
        return topicsService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopic(@RequestBody Topics topic){
        topicsService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT,value="/topics/{id}")
    public void updateTopic(@RequestBody Topics topic,@PathVariable String id){
        topicsService.updateTopic(topic,id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicsService.deleteTopic(id);

    }

}
