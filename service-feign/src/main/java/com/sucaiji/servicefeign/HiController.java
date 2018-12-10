package com.sucaiji.servicefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HiController {

    @Autowired
    private HiService hiService;

    @RequestMapping("/hi")
    @ResponseBody
    public String hi() {
        return hiService.sayHi();
    }

}
