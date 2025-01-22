package Abstraction20nov;
class Mybook extends Book
{
	@Override
	public  void setTitle(String title)
	{
		this.title=title;
	}
	@Override
	public String getTitle()
	{
		return "The Title of my Book is:"+this.title;
		
	}
	

}