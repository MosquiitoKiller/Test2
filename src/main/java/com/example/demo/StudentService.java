package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Service class responsible for the logic of saving the search and deletion of students
 */
@Service
public class StudentService {
    /** Array for storing students */
    private ArrayList<Student> students = new ArrayList<>();

    /**
     * Method responsible for student retention
     * @param student Student
     * @return Save Result
     */
    public boolean save (Student student){
        return students.add(student);
    }

    /**
     * Method responsible for finding a student by last name
     * @param last Student surname
     * @return Search results
     */
    public Student find (String last){
        for (Student st :
                students) {
            if (st.getLastName().equals(last)) return st;
        }
        return new Student("","Not found","");
    }

    /**
     * Method responsible for removing a student by last name
     * @param last Student surname
     * @return Search results
     */
    public Student remove (String last){
        Student st = find(last);
        if(!st.getLastName().equals("Not found")){
            students.remove(st);
            return st;
        }
        else return new Student("","Not found","");
    }
}
