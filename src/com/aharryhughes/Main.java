package com.aharryhughes;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Student> students = new ArrayList<>();

        for(int i = 0; i<15; i++){
            Student student = new Student();
            student.setId(i);
            student.setGrade(1);
            students.add(student);
        }

        ArrayList<Teacher> teachers = new ArrayList<>();

        for(int j = 0; j<3; j++){
            Teacher teacher = new Teacher();
            teacher.setId(j);
            teacher.setGrade(1);
            teachers.add(teacher);
        }

        HashMap<Teacher, HashSet<Student>> studentTeacher = new HashMap<>();

        for(int k = 0; k<3; k++){
            HashSet<Student> studentClass = new HashSet<>();
            for (int l = k*5; l<(k*5)+5; l++){
                studentClass.add(students.get(l));
            }
            studentTeacher.put(teachers.get(k), studentClass);
        }

        for(int m = 0; m<studentTeacher.keySet().size(); m++){
            Object[] tmpTeachers = studentTeacher.keySet().toArray();
            System.out.println(tmpTeachers[m]);
            Object[] tmpStudents = studentTeacher.get(teachers.get(m)).toArray();
            for(int n = 0; n<tmpStudents.length; n++){
                System.out.println(tmpStudents[n]);
            }
        }
    }
}
