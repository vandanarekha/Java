class Deadlock
{
static Object ol1=new Object();
static Object ol2=new Object();
static class Thread1 extends Thread
{
public void run()
{
synchronized(ol1)
{
System.out.println("Thread1 locked object1");
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("Thread1 waiting for object2");
synchronized(ol2)
{
System.out.println("No Deadlock");
}
}
}
}
static class Thread2 extends Thread
{
public void run()
{
synchronized(ol2)
{
System.out.println("Thread2 locked object2");
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("Thread2 waiting for object1");
synchronized(ol1)
{
System.out.println("No Deadlock");
}
}
}
}
public static void main(String args[])
{
Thread1 t1=new Thread1();
Thread2 t2=new Thread2();
t1.start();
t2.start();
}
}