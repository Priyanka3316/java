class EvenOdd
{ 
  public static void main(String nik[])
  {
    for(int index=0; index<nik.length; index++)
    {
      String number=nik[index];
      System.out.print(number +"\t");
      int num=Integer.parseInt(number);
      System.out.println(num);
    }
  }
}