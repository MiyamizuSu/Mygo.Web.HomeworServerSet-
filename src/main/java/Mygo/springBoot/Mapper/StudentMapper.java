package Mygo.springBoot.Mapper;

import Mygo.springBoot.models.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Select("select * from mygo_web_studentdata")
    List<Student> selectBooks();
    @Insert("insert into mygo_web_studentdata values(#{studentName},#{studentNumber},#{studentClass})")
    void insert(Student student);
}
