package Mygo.homework2.springBootServer.Mygo.homework2.springBootServer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
import Mygo.models.Student;
@Controller
public class studentRegister {
    @RequestMapping("/user/register")
    @ResponseBody
    @CrossOrigin(origins = "*")
    public Map register(@RequestBody Map<String,String> map){
        Student newStudent=new Student(map.get("studentName"),map.get("studentNumber"),map.get("studentClass"));
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
        System.out.println(username);
        System.out.println(password);
        return null;
    }
}
