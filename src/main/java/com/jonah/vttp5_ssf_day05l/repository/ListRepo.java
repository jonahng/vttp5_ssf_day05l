package com.jonah.vttp5_ssf_day05l.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.jonah.vttp5_ssf_day05l.utility.Util;

@Repository
public class ListRepo {
    
    @Autowired
    @Qualifier(Util.template02)
    RedisTemplate<String, Object> template;

    //ppt slide 30
    public void leftPush(String key, String value){
        template.opsForList().leftPush(key,value);
    }

    public void rightPush(String key, String value){
        template.opsForList().rightPush(key,value);
    }


    public void leftPop(String key){
        template.opsForList().leftPop(key, 1);
    }

    public void rightPop(String key){
        template.opsForList().rightPop(key,1);
    }

    public String get(String key, Integer index){
        return template.opsForList().index(key, index).toString();
    }

    public Long size(String key){
        return template.opsForList().size(key);
    }


}
