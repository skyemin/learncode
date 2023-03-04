package com.wei.learncode.spring.source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CircularRefA {
    CircularRefA(){
        System.out.println("Instance of CircularRefA ======");
    }
    @Autowired
    private CircularRefB circularRefB;
}
