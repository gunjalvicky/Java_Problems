package AbstractDay2_21Nov;

public  class Test extends Car
{
	

	public Test(String brand, String model, int milage, int top_speed, int yearOfManufacturing) 
	{
		super(brand, model, milage, top_speed, yearOfManufacturing);
	}

	@Override
	public void display()
	{
		System.out.println("Test [brand=" + brand + ", model=" + model + ", milage=" + milage + ", top_speed=" + top_speed
				+ ", yearOfManufacturing=" + yearOfManufacturing + "]");
	}
}
