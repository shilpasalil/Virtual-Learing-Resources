package org.launchcode.VirtualLearningResources.Controllers;

import org.launchcode.VirtualLearningResources.models.data.ParentRepository;
import org.launchcode.VirtualLearningResources.models.data.StudentRepository;
import org.launchcode.VirtualLearningResources.models.data.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private ParentRepository parentRepository;

    //@GetMapping("student/index")
    @GetMapping("index")
    public String index(Model model){
        model.addAttribute("title", "Students" );
        //model.addAttribute(new Student());
       // model.addAttribute("teachers", teacherRepository.findAll());
       // model.addAttribute("parents", parentRepository.findAll());
        return "student/index";
    }


}
