package com.srikanth.Controller;

import com.srikanth.Model.Student;
import com.srikanth.Service.Impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@RestController
@RequestMapping("/StudentService")
public class StudentController {

    @Autowired
    StudentServiceImpl studentService;


    @RequestMapping(value = "/RegisterStudent", method = RequestMethod.POST)
    public Student registerSuccess(@RequestBody Student student) {

        //@RequestParam("name") String name , @RequestParam("age") Integer age , @RequestParam("dept") String dept
        /*
         * Student student = new Student();
         *
         * student.setName(name); student.setAge(age); student.setDept(dept);
         */


        studentService.addStudent(student);

        return student;

    }

    @RequestMapping(value = "/addLaptop", method = RequestMethod.POST)
    public String chooseLaptop(@RequestBody HashMap<String, Integer> laptop)//@RequestParam("sid") int sid , @RequestParam("lid") int lid
    {


        System.out.println(" sid = " + laptop.get("sid") + " :: " + " lid =  " + laptop.get("lid"));

        studentService.addLaptop(laptop.get("sid"), laptop.get("lid"));

        return "Laptop Added Successfully";

    }

    @RequestMapping(value = "/getStudentDetails", method = RequestMethod.GET)
    public List<Student> DisplayAllStudents() {

        List<Student> list = studentService.displayAllStudents();

        return list;


    }

    @RequestMapping(value = "/getStudentById/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") int id) {
        Student student = new Student();

        student = studentService.getStudentById(id);

        return student;
    }


    @RequestMapping(value = "/addAddress", method = RequestMethod.POST)
    public String addAddress(@RequestBody HashMap<String, Integer> address) {
        System.out.println(" sid = " + address.get("sid") + " :: " + " lid =  " + address.get("lid"));

        studentService.addAddress(address.get("sid"), address.get("aid"));

        return "Address Added Successfully";

    }

    @RequestMapping(value = "/addAccount", method = RequestMethod.POST)
    public String addAccount(@RequestBody HashMap<String, Integer> account) {


        System.out.println(" sid = " + account.get("sid") + " :: " + " aid =  " + account.get("aid"));

        studentService.addAccount(account.get("sid"), account.get("aid"));

        return "Account Added Successfully";

    }

}
