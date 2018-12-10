package com.sucaiji.servicefeign;

import org.springframework.stereotype.Component;

@Component
public class EurekaClientFeignHystrix implements EurekaClientFeign {
    @Override
    public String sayHiFromClientEureka() {
        return "sorry,error!";
    }
}
