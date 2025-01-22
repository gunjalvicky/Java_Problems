package AbstractDay2_21Nov;

public class Circle extends Shape 
{
	double radius;
	
	public Circle(double radius) 
	{
		super();
		this.radius = radius;
	}
	@Override
	public double getArea()
	{
		final double pi=3.14;
		return pi*(radius*radius);
		
	}
	@Override
	public String printDetails()
	{
		return "Type : "+this.getClass().getSimpleName()+"\nArea : "+this.getArea()+"\n";
	}

}
