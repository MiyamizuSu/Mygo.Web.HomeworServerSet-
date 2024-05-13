package Mygo.springBoot.biz;

import Mygo.springBoot.Mapper.StudentMapper;
import Mygo.springBoot.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentBiz {
    @Autowired//spring通过setter给这个属性注入一个对象，
    // 如果属性是接口或抽象类行的，spring会自己去匹配其实现类或子类
    private StudentMapper studentMapper;

    public List<Student> findAll(){
        return studentMapper.selectBooks();
    }
    public void addNewStudent(Student student){
        studentMapper.insert(student);
    }
}
