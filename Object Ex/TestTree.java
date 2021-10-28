class TestTree
{
	public static void main(String []args)
	{
		Tree tr=new Tree();
		String TreeName=tr.name;
		float Height=tr.height;
		long Leaves=tr.noOfLeaves;
		
		tr.grow();
		
		String res=tr.cutting();
				
		System.out.println(TreeName);
		System.out.println(Height);
		System.out.println(Leaves);
		
		System.out.println(res);
		
		
		
	}
}
	