/* Write a class encapsulating the concept of a cousre grade, assumong a course grade
 has attributes: a course name and a letter grade. Include a constructor, 
the asseccors and mutators*/
public class Question57 {

//Attributes
String courseName;
String courseGrade;

//Constructors
public Question57(){
	setCourseName(courseName);
	setCourseGrade(courseGrade);
}

//Mutators
public Question57(String courseName, String courseGrade){
this.courseName = courseName;
this.courseGrade = courseGrade;
}

//Accessors
public String getCourseName(){
return courseName;
}

public String getCoursegrade(){
return courseGrade;
}

public void setCourseName(String newCourseName){
this.courseName = newCourseName;
}

public void setCourseGrade(String newCourseGrade){
this.courseGrade = newCourseGrade;
}

//Tostring
public String toString(){
return courseName + " : " + courseGrade;
}

//equals
public static boolean equals(Question57 a, Question57 b){

return a.getCoursegrade().equalsIgnoreCase(b.getCoursegrade());

}

//CLIENT CLASS
//public class Question57Client{

	public static void main (String[] args){
    Question57 a = new Question57(" Math ", " A ");
    Question57 b = new Question57(" Programming ", " A ");
    System.out.println(a.equals(b));   
	}
}
