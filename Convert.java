import java.util.*;
class Convert
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a decimal number");
int n=sc.nextInt();
int bin[]=new int[100];
int i=0;
while(n>0)
{
bin[i++]=n%2;
n=n/2;
}
System.out.print("binary number is:");
for(int j=i-1;j>=0;j--)
{
System.out.print(bin[j]);
}
}
}