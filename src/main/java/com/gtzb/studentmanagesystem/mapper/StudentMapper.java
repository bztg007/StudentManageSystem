package com.gtzb.studentmanagesystem.mapper;
import com.gtzb.studentmanagesystem.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {
    //查询所有
    @Select("SELECT * FROM student")
    List<Student> findAll();

    //新增
    @Insert("INSERT INTO student(name,age,gender) VALUES (#{name},#{age},#{gender})")
    int insert(Student student);

    //修改
    @Update("UPDATE student SET name=#{name},age=#{age},gender=#{gender} WHERE id=#{id}")
    int update(Student student);

    //删除
    @Delete("DELETE FROM student WHERE id=#{id}")
    int deleteById(Integer id);
}