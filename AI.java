class AI
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int n[]=new int[a];
try
{
n[5]=100;
System.out.println("c="+n[5]);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("error");
}
}
}