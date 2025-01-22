package AbstractDay2_21Nov;

public class TestingExample3 
{

	public static void main(String[] args) 
	{
		Food food=new Bread(4.0,1.1,13.8);
		food.getMacroNutrients();
		food.getTaste();
		System.out.println("=======================");
		Food food1=new Egg(5.0,1.5,12.8);
		food1.getMacroNutrients();
		food1.getTaste();
	}

}
