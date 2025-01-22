package Abstraction20nov;

class ScienceStudent extends Student 
{
	private int physicsMark;
	private int chemistryMarks;
	private int mathMarks;
	
	public ScienceStudent(String studentName, String studentClass, int physicsMark, int chemistryMarks, int mathMarks) 
	{
		super(studentName, studentClass);
		this.physicsMark = physicsMark;
		this.chemistryMarks = chemistryMarks;
		this.mathMarks = mathMarks;
	}

	public int getPhysicsMark() {
		return physicsMark;
	}

	public void setPhysicsMark(int physicsMark) {
		this.physicsMark = physicsMark;
	}

	public int getChemistryMarks() {
		return chemistryMarks;
	}

	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}

	public int getMathMarks() {
		return mathMarks;
	}

	public void setMathMarks(int mathMarks) {
		this.mathMarks = mathMarks;
	}

	@Override
	public int getpercentage()
	{
		return (chemistryMarks+mathMarks+mathMarks)/3;
	}
   
}
