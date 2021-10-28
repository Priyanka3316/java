class Tree
{
	String name="Orange";
	float height=15.0f; 
	long noOfLeaves=4800;
	short branches=150;
	String type="Fruits";
	
	void grow()
	{
		System.out.println("Tree grow fast");
	}
	static String cutting()
	{
		System.out.println("we can cut trees");
		return "cut";
	}
}