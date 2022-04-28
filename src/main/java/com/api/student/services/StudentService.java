package com.api.student.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.api.student.entities.InputData;
import com.api.student.entities.Student;

@Service
public class StudentService {
	/*private static final String Id = null;
	private static List<Student> list=new ArrayList<>();
	
	static {
	list.add(new Student(true, "A","1","334",4,"R"));
	list.add(new Student(true, "john_patil_17091999", "john@gmail.com", "ABCD123", 1, "R"));
	//	list.add(new Student(103, "Dinesh", "din@gmail.com", "Durgapur"));
	}

	public List<Student> getAllStudents() {
		return list;
	}

	public Student getStudentById(int id) {
		Student stud=null;
		stud=list.stream().filter(student->student.getUser_id()== Id).findFirst().get();
		return stud;
	}
*/
	public Student addStudent(InputData inputData) {
	       Student student=new Student();
	       
	       student.setIs_success(true);
	       student.setUser_id("ashwini_dabhade_18071995");
	       student.setEmail("ashwini@gmail.com");
	       student.setRoll_number("210943520020");
	       
	     List<String> data=inputData.getData();
	     
	     
	     List<Integer> numbersList= new ArrayList<>();
	       List<String> alphabetsList= new ArrayList<>();
	       
	       for(int i=0;i<data.size();i++) {
	    	   
	    	   if( (data.get(i).charAt(0) >= 'a' && data.get(i).charAt(0) <= 'z') || (data.get(i).charAt(0) >= 'A' && data.get(i).charAt(0) <= 'Z'))
	    	   {
	    			   alphabetsList.add(data.get(i));
	    		   }

	       		}
	       
for(int i=0;i<data.size();i++) {
	    	   
	    	   if( (Integer.parseInt(data.get(i)) >= 0 && (Integer.parseInt(data.get(i))) <= 999) )
 {
	    		   numbersList.add((Integer.parseInt(data.get(i))));
	    		   }

	       }
	      
	       student.setNumbers(numbersList);
	       student.setAlphabets(alphabetsList);
	       
	       
		return student;
	}
}
