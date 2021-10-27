class Motherboard
{
	static int port(int a, int b)
	{
		return a+b;
	}
	static int port(int a, int b, int c)
	{
		return a+b+c;
	}
}

class TestMotherboard
{
	public static void main(String[] nik)
	{
		System.out.println(ports.port(4,9));
		System.out.println(ports.port(4,9,6));
	}
}