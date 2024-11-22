package com.jonah.vttp5_ssf_day05l.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonah.vttp5_ssf_day05l.repository.ListRepo;
import com.jonah.vttp5_ssf_day05l.repository.ValueRepo;

@Service
public class RedisTestService {

    @Autowired
    ListRepo lrepo;

    @Autowired
    ValueRepo vrepo;
}
