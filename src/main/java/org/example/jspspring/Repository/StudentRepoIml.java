package org.example.jspspring.Repository;

import org.example.jspspring.Model.Student;

import java.util.List;

public class StudentRepoIml {
    private StudentRepo studentRepo;
   public void addStudent(Student student) {
studentRepo.save(student);
   }
    public void deleteStudent(int id) {
         studentRepo.deleteById(id);
    }
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }
    public Student getStudent(int id) {
        return studentRepo.findById(id).orElse(null);
    }
    public void updateStudent(Student student) {
        studentRepo.save(student);
    }

    public StudentRepo getStudentRepo() {
        return studentRepo;
    }

    public void setStudentRepo(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }
}
