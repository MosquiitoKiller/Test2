package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Service class responsible for the logic of saving search and deleting groups
 */
@Service
public class GroupService {
    /** Array for storing groups */
    private ArrayList<Group> groups = new ArrayList<>();

    /**
     * The method responsible for maintaining the group
     * @param group Group
     * @return Save Result
     */
    public boolean save(Group group){
        return groups.add(group);
    }

    /**
     * Method responsible for finding a group by name
     * @param str Group name
     * @return Search results
     */
    public Group find(String str){
        for (Group gr : groups) {
            if (str.equals(gr.getGroupName())) return gr;
        }
        return new Group("Not found");
    }

    /**
     * Method responsible for deleting a group by name
     * @param str Group name
     * @return Search results
     */
    public Group remove(String str){
        Group gr = find(str);
        if(!gr.getGroupName().equals("Not found")){
            groups.remove(gr);
            return gr;
        }
        else return new Group("Not found");
    }
}
