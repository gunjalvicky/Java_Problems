package AbstractDay2_21Nov;

public class Egg extends Food
{
	String type;

	
	public Egg(double proteins, double fats, double carbs)
	{
		super(proteins, fats, carbs,7);
		this.type = "non_vegetarian";
	}


	@Override
	public void getMacroNutrients()
	{
		System.out.println("Egg is Non_vegetarion");
		System.out.println("An egg has" +this.proteins+" gms of protein,"+this.fats+"gms of fats and "+this.carbs+" gms of carbohydrates.\"");
	}
	@Override
	public void getTaste()
	{
		System.out.println(tastyScore);
		
	}
	
	

}
