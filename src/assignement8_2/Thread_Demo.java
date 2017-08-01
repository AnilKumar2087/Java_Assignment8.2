package assignement8_2;

class Thread_Demo
{
	public static void main(String args[])
	{
		//Thread one is created to print prime numbers
		new Prime().start();
		
		//Thread 2 is created and prints non prime numbers
		new NotPrime().start();
	}
}