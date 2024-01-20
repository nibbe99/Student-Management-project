package studentManagementSystem;

import java.util.ArrayList;
import java.util.List;


public class Student {
	
	public final static int COST_OF_COURSE = 600;
	private static List<Integer> ALL_ID = new ArrayList();
	
	private String name;
	private int gradeYear;
	private int studentID;
	private List<String>courses = new ArrayList();
	private long tuitionBalance = 10_000;
	
	
	public Student(String name, int gradeYear) {
		this.name = name;
		this.gradeYear = gradeYear;
		studentID = generateID();
	}
	
	public Student(String name, int gradeYear, List<String>courses) {
		this.name = name;
		this.gradeYear = gradeYear;
		this.courses = courses;
		studentID = generateID();
		setTuitionBalance(10_000 - (COST_OF_COURSE * courses.size()));
	}
	
	//generate an id
	private int generateID() {
		String generate = ""+gradeYear;
		for(int i = 0; i < 4; i++) {
			int numb = (int)(9 * Math.random()+1);
		//	System.out.println(numb);
			generate+=numb;
		//	System.out.println("String: " + generate);
		}
		int generatedId =  Integer.parseInt(generate);
		
		//Check if generated ID exists
		if(ALL_ID.contains(generatedId)) {
			generateID();		//make a new ID
		}
		ALL_ID.add(generatedId);
		return Integer.parseInt(generate);
	}
	
	//view all IDs from students
	public static List<Integer> showStudentsById(){
		if(ALL_ID.isEmpty()) {
			System.out.println("No students enrolled");
		}
		return ALL_ID;
	}
	

	public long getTuitionBalance() {
		return tuitionBalance;
	}
	
	public void setTuitionBalance(long tuitionBalance) {
		this.tuitionBalance = tuitionBalance;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGradeYear() {
		return gradeYear;
	}

	public void setGradeYear(int gradeYear) {
		this.gradeYear = gradeYear;
	}

	public int getStudentID() {
		return studentID;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void addCourses(String course) {
		this.courses.add(course);
		this.tuitionBalance-=600;
	}

	public String showStudent() {
		return "Student [ID="+ studentID + ", name=" + name + ", gradeYear=" 
				+ gradeYear + ", courses=" + courses + ", tuitionBalance="
				+ tuitionBalance + "$]";
	}
	
	
	
}




