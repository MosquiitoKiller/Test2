package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

/**
 * Controller class responding to group view
 */
@Controller
@RequestMapping("/home/Gr")
public class GroupController {
    /** Service class responsible for the logic of saving, searching and deleting groups */
    @Autowired
    private GroupService groupService;

    /**
     * The method responsible for displaying the saved group
     * @param group Group name
     * @param model Model page
     * @return HTML page
     */
    @GetMapping("/create")
    public String create(@RequestParam String group, Model model){
        groupService.save(new Group(group));
        model.addAttribute("gr",group);
        return "Groups";
    }

    /**
     * The method responsible for displaying the desired group
     * @param group Group name
     * @param model Model page
     * @return HTML page
     */
    @GetMapping("/{group}")
    public String read(@PathVariable String group, Model model){
        model.addAttribute("gr",groupService.find(group).getGroupName());
        return "Groups";
    }

    /**
     * Method responsible for displaying the deleted group
     * @param group Group name
     * @param model Model page
     * @return HTML page
     */
    @GetMapping("/del/{group}")
    public String delete(@PathVariable String group,Model model) {
        model.addAttribute("gr",groupService.remove(group).getGroupName());
        return "Groups";
    }
}
