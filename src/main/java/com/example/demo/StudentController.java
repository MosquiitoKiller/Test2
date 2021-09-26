package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.TreeMap;

/**
 * Controller class responding to student view
 */
@Controller
@RequestMapping("/home/St")
public class StudentController {
    /** Service class responsible for the logic of saving the search and deletion of students */
    @Autowired
    private StudentService studentService;

    /**
     * Method responsible for displaying the saved student
     * @param name Name
     * @param last Surname
     * @param mid middle name
     * @param model Model page
     * @return HTML page
     */
    @GetMapping(path ="/create")
    public String create(@RequestParam String name,
                         @RequestParam String last,
                         @RequestParam String mid, Model model)
    {
        studentService.save(new Student(name,last,mid));
        model.addAttribute("name",name);
        model.addAttribute("last",last);
        model.addAttribute("mid",mid);
        return "Students";
    }

    /**
     * Method responsible for displaying the desired student
     * @param last Surname
     * @param model Model page
     * @return HTML page
     */
    @GetMapping("/{last}")
    public String read(@PathVariable String last,Model model){
        Student student = studentService.find(last);
        model.addAttribute("name",student.getFirstName());
        model.addAttribute("last",student.getLastName());
        model.addAttribute("mid",student.getMiddleName());
        return "Students";
    }

    /**
     * Method responsible for displaying the removed student
     * @param last Surname
     * @param model Model page
     * @return HTML page
     */
    @GetMapping("/del/{last}")
    public String delete(@PathVariable String last,Model model) {
        Student student = studentService.remove(last);
        model.addAttribute("name",student.getFirstName());
        model.addAttribute("last",student.getLastName());
        model.addAttribute("mid",student.getMiddleName());
        return "Students";
    }
}
