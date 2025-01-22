package Abstraction20nov;

class HistoryStudent extends Student 
{
	private int historyMarks;
	public HistoryStudent(String studentName, String studentClass, int historyMarks, int civicsMarks) 
	{
		super(studentName, studentClass);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}

	private int civicsMarks;
	
	public int getHistoryMarks() {
		return historyMarks;
	}


	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}


	public int getCivicsMarks()
	{
		return civicsMarks;
	}


	public void setCivicsMarks(int civicsMarks) {
		this.civicsMarks = civicsMarks;
	}

	@Override
	public int getpercentage()
	{
		return (civicsMarks+historyMarks)/2;
		
	}
	

}
