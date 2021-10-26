class Pink
{
	static byte[] numbers={1,2,3,4,5,6,7,8,9};
	static short[] even_numbers={2,4,6,8,10};
	static int[] odd_numbers={1,3,5,7,9};
	static long[] train_numbers={675496, 858956, 649873, 917493, 784684};
	static float[] dec_numbers={1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f};
	static double[] db_numbers={34.87, 97.34, 8.98, 1.34, 2.45};
	static char[] alpha={'a', 'b', 'c', 'd', 'e', 'f'};
	static boolean[] is_java_fun={true, false};

	public static void main(String[] pink)
	{
		for(int i=0; i<numbers.length; i++)
		System.out.println(numbers[i]);
	
		for(int i=0; i<even_numbers.length; i++)
		System.out.println(even_numbers[i]);
	
		for(int i=0; i<odd_numbers.length; i++)
		System.out.println(odd_numbers[i]);

		for(int i=0; i<train_numbers.length; i++)
		System.out.println(train_numbers[i]);
	
		for(int i=0; i<dec_numbers.length; i++)
		System.out.println(dec_numbers[i]);

		for(int i=0; i<db_numbers.length; i++)
		System.out.println(db_numbers[i]);

		for(int i=0; i<alpha.length; i++)
		System.out.println(alpha.length);

		for(int i=0; i<is_java_fun.length; i++)
		System.out.println(is_java_fun[i]);
	}
}