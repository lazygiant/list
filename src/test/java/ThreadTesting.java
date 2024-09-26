class Thread1 implements Runnable
{
	@Override
	public void run() 
	{
		while(true)
		{
		  System.out.println("Thread 1 is running");
		  System.out.println("I am happy");
		}
	}
}
class Thread2 extends Thread
{
	@Override
	public void run() 
	{
		while(true)
		{
		  System.out.println("Thread 2 is running");
		  System.out.println("I am sad");
		}
	}
}
public class ThreadTesting {

	public static void main(String[] args) 
	{
		/*
		 * Thread1 th1 = new ThreadTesting(); Thread2 th2 = new Thread2();
		 * 
		 * th1.start(); th2.start();
		 */
	}
}
