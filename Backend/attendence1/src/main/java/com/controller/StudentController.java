package com.controller;

import com.model.Student;
import com.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.OneToMany;
import java.util.List;
@RestController
@RequestMapping(value="/student")
public class StudentController {

    @Autowired
    StudentService studentService;


    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @GetMapping
    public List<Student> getStudent() {
        logger.info("Employee List");
        return studentService.getStudent();
    }

    @PostMapping("/create")
    public Student create(@RequestBody Student student) {
        logger.info("create student is invoked{}", student);
        return studentService.create(student);
    }
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id")int id)
    {
        logger.info("get student is invoked {}");
        return studentService.getStudentById(id);
    }
    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student)
    {
        logger.info("update student is invoked {}");
        return studentService.updateStudent(student);
    }
    @DeleteMapping("/{id}")
    public Student deleteEmployee(@PathVariable("id") int id)
    {
        logger.info("delete student is invoked {}");
        return studentService.deleteStudent(id);
    }

   /* @GetMapping("/{id}/Admin")
    public List<Student> getStudentByAdmin(@PathVariable("id") int id)
   {
       logger.info("get student by admin is invoked {}");
       return studentService.getStudentByAdmin(id);
   }*/

}

