package Abstraction20nov;

public class StudentTester 
{
	public static void main(String[] args) 
	{
		 
		ScienceStudent student=new ScienceStudent("Rahul","BeComputer",88,76,89);
		System.out.println(student.getpercentage());
		
		
		HistoryStudent historystudent=new HistoryStudent("Nikhil","BeIt",87,65);
		System.out.println(historystudent.getpercentage());
		
		System.out.println("Toatl no of student:"+Student.totalNoOfStudents());
	}

}
