package Abstraction20nov;

 abstract class Student 
{
	protected String studentName;
	protected String studentClass;
	protected static int  totalNoOfStudents;
	public Student(String studentName, String studentClass) 
	{
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
		totalNoOfStudents++;
	}

	public Student() {
		super();
	}

	protected static int totalNoOfStudents()
	{
		return totalNoOfStudents ;
	}
	 abstract public int getpercentage();
	
	public static int getTotalNoStudent()
	{
		return 0 ;
	}
	
}
