class Lagori
{
  static String throwball()
  {
   System.out.println("invoking throwball");
   boolean hitStones=true;
   if (hitStones==true)
   {
    System.out.println("Hit the Ball to Stones");
    return " Ball hitted";
   }
  else
  {
   String res="Ball Missed";
   return res;
  }
 }
}
