package Mygo.springBoot.Mapper;

import Mygo.springBoot.models.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {
    //sql选择查找语句
    @Select("select * from mygo_web_studentdata")
    List<Student> selectBooks();
    //sql增加表项语句
    @Insert("insert into mygo_web_studentdata values(#{studentName},#{studentNumber},#{studentClass})")
    void insert(Student student);
}
