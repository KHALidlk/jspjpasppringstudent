package org.example.jspspring.Controller;

import org.example.jspspring.Model.Student;
import org.example.jspspring.Service.Helloservice;
import org.example.jspspring.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/hello")
public class HelloServlet {

    private Helloservice helloservice;

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public String afficherMessage(ModelMap model) {
        return "formulair";
    }

    @RequestMapping( method = RequestMethod.POST)
    public String ajouterStudent(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("notes") List<Double> notes, ModelMap model) {
        {
            Student student = new Student();
            student.setName(name);
            student.setEmail(email);
            student.setNotes(notes);
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);

            studentService.addStudent(student);
            model.addAttribute("students", studentService.getAllStudents());
            return "index";
        }}
    @RequestMapping( method = RequestMethod.DELETE)
    public String supprimerStudent(@RequestParam("id") int id, ModelMap model) {
        studentService.deleteStudent(id);
        model.addAttribute("students", studentService.getAllStudents());
        return "index";
    }
    public HelloServlet() {
    }

    public Helloservice getHelloservice() {
        return helloservice;
    }

    public void setHelloservice(Helloservice helloservice) {
        this.helloservice = helloservice;
    }
}
