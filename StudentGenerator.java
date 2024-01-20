package studentManagementSystem;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentGenerator {
	
	final static int MAX_COURSES = AllCourses.values().length;
	
	public static Student studentGenerator() {

		String nameFormat = generateName();
		nameFormat = nameFormat.substring(1, nameFormat.length()-1);
		nameFormat = nameFormat.replaceAll("^\"|\"$", "");
		return new Student(nameFormat, generateGradeYear(), generateCourses());
	}
	
	private static String generateName() {
		 
		try {
		@SuppressWarnings("deprecation")
		URL u = new URL("https://raw.githubusercontent.com/dominictarr/random-name/master/first-names.json");
        String [] v = URLnames.stream(u).split(",");
        int randomNumber = (int)(v.length * Math.random()+1);
       return v[randomNumber];
		}
		catch(Exception e) {
			
		}
		return null;
	}
	
	private static int generateGradeYear() {
		int randomGradeYear = (int)(3*Math.random()+1);
		return randomGradeYear;
	}
	
	//Algoritm to always generates unique courses to student.
	//IF same course is generated twice, generate new course
	private static List <String> generateCourses() {	
		List<String>generatedCourses = new ArrayList();
		
		int amountOfCourses = (int)(MAX_COURSES * Math.random()+1);
		
		for(int i = 0; i <amountOfCourses; i++) {
			
			int randomCourse = (int)(MAX_COURSES * Math.random()+1);
			
			for(AllCourses cours : AllCourses.values()) {
				if(cours.getKey()== randomCourse) {
					if(generatedCourses.contains(cours.getCourse())) {
						 randomCourse = (int)(MAX_COURSES * Math.random()+1);
						 break;
					}
					generatedCourses.add(cours.getCourse());
					break;
				}
			}
		}

		return generatedCourses;
		
	}

}
