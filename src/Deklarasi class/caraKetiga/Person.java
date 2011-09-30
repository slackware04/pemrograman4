public class Person
{	
	private Runnable thread = new Runnable()
	{
		public void run()
		{
			System.out.println("HelloWorld from thread");
		}
	};
}
