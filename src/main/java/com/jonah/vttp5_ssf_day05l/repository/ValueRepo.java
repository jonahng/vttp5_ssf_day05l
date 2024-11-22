package com.jonah.vttp5_ssf_day05l.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.jonah.vttp5_ssf_day05l.utility.Util;

@Repository
public class ValueRepo {
    

    //ppt 20
    @Autowired
    @Qualifier(Util.template01)
    RedisTemplate<String, String> template;

    public void createValue(String key, String value) { 
        template.opsForValue().set(key,value);
        //setIfPresent
        //setIfAbsent
    }

    public String getValue(String key){
        return template.opsForValue().get(key);
    }


    //deleting 
    public Boolean deleteValue(String key){
        return template.delete(key);
    }

    //only integers increment
    public void incrementValue(String key){
        template.opsForValue().increment(key);
    }

    public void decrementValue(String key){
        template.opsForValue().decrement(key);
    }


    public void incrementByValue(String key, Integer value){
        template.opsForValue().increment(key, value);
    }

    public void decrementByValue(String key, Integer value){
        template.opsForValue().decrement(key, value);
    }

    public Boolean checkExists(String key) {
        return template.hasKey(key);
    }


}
