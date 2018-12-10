package com.sucaiji.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client")
public interface EurekaClientFeign {

    @GetMapping(value = "/hi")
    String sayHiFromClientEureka();

}
