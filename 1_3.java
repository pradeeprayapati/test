import java.util.Scanner;
public class 1_3 {
       public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	  int sum=0;
int i=0;
while(n!=0)
  
{
  if(i%2==0&i%3==0)
  {
    sum=sum+i;
  }
  i=i+2;
}
System.out.print(sum);