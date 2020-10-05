package org.launchcode.VirtualLearningResources.Controllers;

import org.launchcode.VirtualLearningResources.models.Student;
import org.launchcode.VirtualLearningResources.models.data.ParentRepository;
import org.launchcode.VirtualLearningResources.models.data.StudentRepository;
import org.launchcode.VirtualLearningResources.models.data.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private ParentRepository parentRepository;

    @RequestMapping("")
    //@ResponseBody
    //@GetMapping
    public String index(Model model){

        model.addAttribute("title", "User");
        return "index";
//        return "Hello World! Welcome to Virtual Learning Resources! ";
    }

    @GetMapping("signupStudent")
    public String displaySignupForm(Model model){
        model.addAttribute("title", "Add Student" );
        model.addAttribute(new Student());
        model.addAttribute("teachers", teacherRepository.findAll());
        model.addAttribute("parents", parentRepository.findAll());
        return "student/signup";
    }

   // @PostMapping("newStudent")



    @RequestMapping(value = "thankyou")
    @ResponseBody
    public String thankyou(){
        return "Thank you for visiting Virtual Learning Resources! ";
    }

}
