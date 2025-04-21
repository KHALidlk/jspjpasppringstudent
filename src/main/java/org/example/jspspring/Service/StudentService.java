package org.example.jspspring.Service;

import org.example.jspspring.Model.Student;
import org.example.jspspring.Repository.StudentRepoIml;

import java.util.List;

public class StudentService {
 private StudentRepoIml studentRepoIml;
    public StudentService(StudentRepoIml studentRepoIml) {
        this.studentRepoIml = studentRepoIml;
    }
    public void addStudent(org.example.jspspring.Model.Student student) {
        studentRepoIml.addStudent(student);
    }
    public void deleteStudent(int id) {
        studentRepoIml.deleteStudent(id);
    }
    public void updateStudent(org.example.jspspring.Model.Student student) {
        studentRepoIml.updateStudent(student);
    }
    public List<Student> getAllStudents() {
        return studentRepoIml.getAllStudents();
    }
}
