package com.wei.learncode.spring.source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CircularRefB {
    CircularRefB(){
        System.out.println("Instance of CircularRefB  ======");
    }
    @Autowired
    private CircularRefA circularRefA;
}