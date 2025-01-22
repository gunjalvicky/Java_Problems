package AbstractDay2_21Nov;

public  abstract class Car 
{
	String brand;
	String model;
	int milage;
	int top_speed;
	int yearOfManufacturing;
	
	public Car(String brand, String model, int milage, int top_speed, int yearOfManufacturing) {
		super();
		this.brand = brand;
		this.model = model;
		this.milage = milage;
		this.top_speed = top_speed;
		this.yearOfManufacturing = yearOfManufacturing;
	}
	public Car() 
	{
		super();
	}
	public String carBrand()
	{
		return brand;
	}
	public String carModel()
	{
		return model;
	}
	public int carMilage()
	{
		return milage;
	}
	public int carTopSpeed()
	{
		return top_speed;
	}
	public int carYear()
	{
		return yearOfManufacturing;
	}
	public abstract void display();
	
	

}
