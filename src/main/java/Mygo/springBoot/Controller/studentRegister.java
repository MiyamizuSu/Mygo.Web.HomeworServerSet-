package Mygo.springBoot.Controller;

import Mygo.springBoot.biz.StudentBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Mygo.springBoot.models.Student;
@Controller
public class studentRegister {

    //依赖注入
    @Autowired
    private StudentBiz studentBiz;

    @RequestMapping("/user/register")
    @ResponseBody
    @CrossOrigin(origins = "*")
    public Map register(@RequestBody Map<String,String> map){
        Student newStudent=new Student(map.get("studentName"),map.get("studentNumber"),map.get("studentClass"));
        studentBiz.addNewStudent(newStudent);
        System.out.println(newStudent);
        HashMap response=new HashMap();
        response.put("studentName",newStudent.getStudentName());
        response.put("studentNumber",newStudent.getStudentNumber());
        response.put("studentClass",newStudent.getStudentClass());
        response.put("status",200);
        return response;
    }

    @RequestMapping("/user/login")
    public Map login(String username,String password){
        List<Student> studentList=studentBiz.findAll();
        for(Student student:studentList){
            System.out.println(student);
        }
        return null;
    }

    @CrossOrigin(origins = "*")
    @RequestMapping("/user/studentMessage")
    @ResponseBody
    public Map studentMessage(){
        List<Student> studentList=studentBiz.findAll();
        Map<String,List<Student>> response=new HashMap<String,List<Student>>();
        response.put("studentMessage",studentList);
        return response;
    }
}
