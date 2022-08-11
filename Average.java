/*
   authour name:Baskar.K
   program name:average in two integer numbers using in While loop
   Date :11/08/2022
*/
   
import java .util.*;
class Average
{
 public static void main(String[]args)
 {
  Scanner Sc=new Scanner(System.in);
  System.out.println("enter the  value:");
  int i=Sc.nextInt();
  System.out.println("enter the value:");
  int j=Sc.nextInt();
  int sum=0;
  while(i<j)
  {
	System.out.println("The average value ="+sum);
        sum+=i; 
        j++;
  }
 }
}
  
  
  