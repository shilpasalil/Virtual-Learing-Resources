package org.launchcode.VirtualLearningResources.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

 //   @RequestMapping(value = "")
 //   @ResponseBody
   @GetMapping
    public String index(){
        return "index";
//        return "Hello World! Welcome to Virtual Learning Resources! ";
    }



    @RequestMapping(value = "thankyou")
    @ResponseBody
    public String thankyou(){
        return "Thank you for visiting Virtual Learning Resources! ";
    }

}
