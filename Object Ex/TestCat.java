class TestCat
{
	public static void main(String []a)
	{
		Cat c=new Cat();
		String Breed=c.breed;
		int Leg=c.leg;
		float Height=c.height;
		String Eat=c.eat;
		String Drink=c.drink;
		byte Weight=c.weight;
		
		c.run();
		
		String res=c.run();
				
		System.out.println(Breed);
		System.out.println(Leg);
		System.out.println(Height);
		System.out.println(Eat);
		System.out.println(Drink);
		System.out.println(Weight);
		
		System.out.println(c);		
	}
}