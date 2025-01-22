package AbstractDay2_21Nov;

public class Bread extends Food
{
		String type;

		public Bread(double proteins, double fats, double carbs) 
		{
			super(proteins, fats, carbs, 8);
			this.type = "vegetarian";
		}

		@Override
		public void getMacroNutrients()
		{
			System.out.println("Bred Is Vegetarion");
			System.out.println(" A slice of bread has"+this.proteins+"gms of protein" +this.fats+ "gms of fats and" +this.carbs+ "gms of carbohydrates.");
			
		}
		public void getTaste()
		{
			System.out.println(tastyScore);
		}
	
	

}
