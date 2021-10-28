class EvenOdd1
{
 public static void main(String p[])
 {
  for(int index=0; index<p.length; index++)
  {
   String number=p[index];
   System.out.print(number +"\t");
   float num=Float.parseFloat(number);
   System.out.println(num);
  }
 }
}