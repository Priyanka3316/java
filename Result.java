class Result
{
 public static void main(String []marks)
 {
  for (int mark=0; mark< marks.length; mark++)
  {
   String cgpa=marks[mark];
   float per= Float.parseFloat(cgpa);
   int percentage=Integer.parseInt(cgpa);
   double perc=Double.parseDouble(cgpa);
   long pers=Long.parseLong(cgpa);
   short perce=Short.parseShort(cgpa);
   boolean perc1=Boolean.parseBoolean(cgpa);
   
  System.out.println(cgpa +"\t"+ per +"\t"+ percentage +"\t"+ perc +"\t"+ pers +"\t"+ perce +"\t"+ perc1);
  }
 }
}