package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicsService {

    @Autowired
            private TopicsRepository topicsRepository;
    List<Topics> topics=new ArrayList<>( Arrays.asList(
            new Topics("spring","Spring Framework","Spring description"),
            new Topics("java","java Framework","java description"),
            new Topics("js","js Framework","js description"),
            new Topics("maths","maths Framework","maths description")
    ));

    public List<Topics> getAllTopics(){
        List<Topics> l=new ArrayList<>();
        topicsRepository.findAll().forEach(x->l.add(x));
        return l;
    }

    public Optional<Topics> getTopic(String id){
//        return topics.stream().filter(x->x.getId().equals(id)).findFirst().get();
        return topicsRepository.findById(id);
    }

    public void addTopic(Topics topic){
        topicsRepository.save(topic);
    }

    public void updateTopic(Topics topic, String id) {
//        for(int i=0;i<topics.size();i++){
//            Topics t=topics.get(i);
//            if(t.getId().equals(id)){
//                topics.set(i,topic);
//                return;
//            }
//        }
        topicsRepository.save(topic);
    }

    public void deleteTopic(String id) {
//        for(int i=0;i<topics.size();i++){
//            Topics t= topics.get(i);
//            if(t.getId().equals(id)){
//                topics.remove(topics.get(i));
//                return;
//            }
//        }
        topicsRepository.deleteById(id);
    }
}
