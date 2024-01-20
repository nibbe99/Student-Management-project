package studentManagementSystem;

public enum AllCourses{
	
	B_LANGUAGE("B_Language", 1), 
	ENGLISH("English", 2), 
	MATH("Math", 3), 
	SCIENCE("Science", 4),
	SWEDISH("Swedish", 5),
	HISTORY("History", 6),
	GEOGRAPHY("Geography", 7),
	CODING("Coding", 8),
	Computer_Science("Computer Science", 9),
	Chemistry("Chemistry", 10),
	Biology("Biology", 11),
	Ethical_Hacking("Ethical Hacking", 12),
	ASSEMBLY("Assembly", 13),
	;
	
	private String course;
	private int key;
	
	AllCourses(String course, int key){
		this.course = course;
		this.key = key;
	}
	
	public int getKey(){
		return key;
	}
	
	public String getCourse() {

		return this.course;
	}
	
}