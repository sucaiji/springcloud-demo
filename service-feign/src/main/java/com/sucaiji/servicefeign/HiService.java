package com.sucaiji.servicefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HiService {

    @Autowired
    private EurekaClientFeign eurekaClientFeign;

    public String sayHi() {
        return eurekaClientFeign.sayHiFromClientEureka();
    }
}
