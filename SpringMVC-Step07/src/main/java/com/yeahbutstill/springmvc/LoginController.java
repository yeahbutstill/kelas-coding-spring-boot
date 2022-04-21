package com.yeahbutstill.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// Bagaimana cara memberitahu saya, bahwa ini adalah controller di dalam servlet
@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    @ResponseBody
    public String sayHello() {
        return "Hello World";
    }

}
