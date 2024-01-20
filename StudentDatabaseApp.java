package studentManagementSystem;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentDatabaseApp {
	
	static	List<Student>students= new ArrayList();
	
	public static void main(String args[]) {
		
		//Create a student on ur own:
		
	//	addStudents(5);
	
		for(int i = 0; i < 50; i++) {
			Student ss=	StudentGenerator.studentGenerator();
			students.add(ss);
		}
		
		printToText();
		
		showAllStudents();
		
		System.out.println(Student.showStudentsById());
	}
	
	static void  addStudents(int amount){	
		Scanner in = new Scanner(System.in);
		Scanner inNumber = new Scanner(System.in);
		for(int i = 0; i < amount; i++) {
			System.out.print("Enter student name: ");
			String inputName = in.nextLine();
			System.out.println("Enter the grade, \n1-middle school \n2-high school \n3-university");
			int gradeYear = inNumber.nextInt();
			
			students.add(new Student(inputName, gradeYear));
			System.out.println("Student created: " + "Name: " + inputName + ", Grade " + gradeYear);
		}
		
	}
	
	static void showAllStudents() {
		for(int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).showStudent());
		}
	}
	
	static void printToText() {
		
		File f = new File("ALL_Students.txt");
		System.out.println(f.getAbsolutePath());
		
		try {
			f.createNewFile();
			FileWriter fw = new FileWriter(f);
			
			for(int i = 0; i < students.size(); i++) {
				fw.append(students.get(i).showStudent());
				fw.append("\n");
			}
			fw.close();
		}
		catch(Exception e){
			
		}
	}
	
}





















