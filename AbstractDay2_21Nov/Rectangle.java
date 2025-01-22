package AbstractDay2_21Nov;

public class Rectangle extends Shape
{	
	double length;
	double bredth;
	
	public Rectangle(double length, double bredth) 
	{
		super();
		this.length = length;
		this.bredth = bredth;
	}
	@Override
	public double getArea()
	{
		return length*bredth;
		
	}
	@Override
	public String printDetails()
	{
		return "Type : "+this.getClass().getSimpleName()+"\nLength : "+this.length+"\nBreadth : "+this.bredth+"\nArea : "+this.getArea()+"\n";
	}
	
}
