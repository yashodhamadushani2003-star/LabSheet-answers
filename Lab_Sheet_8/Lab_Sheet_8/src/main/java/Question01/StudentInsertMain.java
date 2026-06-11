/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question01;

import Question01.StudentDAO;
import Question01.Student;

/**
 *
 * @author User
 */
public class StudentInsertMain {
    public static void main(String[] args) {
        
       
        Student newStudent = new Student(101, "Kasun Perera", 85);
        
       
        StudentDAO studentDAO = new StudentDAO();
        
        studentDAO.addStudent(newStudent);
    }
}