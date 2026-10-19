package com.gtzb.studentmanagesystem.controller;
import com.gtzb.studentmanagesystem.entity.Student;
import com.gtzb.studentmanagesystem.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentMapper studentMapper;

    //查询
    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentMapper.findAll();
    }

    //新增（接受前端传来的JSON对象）
    @PostMapping("/student")
    public String addStudent(@RequestBody Student student){
        studentMapper.insert(student);
        return  "新增成功";
    }

    //修改（接受前端传来的JSON对象，必须包含id）
    @PutMapping("/student")
    public String updateStudent(@RequestBody Student student){
        studentMapper.update(student);
        return  "修改成功";
    }

    //删除（根据URL路劲的id删除
    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable Integer id){
        studentMapper.deleteById(id);
        return  "删除成功";
    }

}