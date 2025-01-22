package AbstractDay2_21Nov;

public class Traingle extends Shape
{
	double base;
	double height;
	
	public Traingle(double base, double height)
	{
		super();
		this.base = base;
		this.height = height;
	}
	@Override
	public double getArea()
	{
		return (0.1/0.2*base*height);
		
	}
	@Override
	public String printDetails()
	{
		return "Type : "+this.getClass().getSimpleName()+"\nBase : "+this.base+"\nHeight : "+this.height+"\nArea : "+this.getArea();
	}

}
