
class impares implements Runnable
{
	int n; 

	public impares(int n)
	{
		this.n = n; 
	}
	public void run()
	{
		System.out.print("Imprimiendo numeros impares");
		for(int i = 0; i < n; i++)
		{
			if(i%2 != 0)
			{
				System.out.println(i);
				System.out.println(""); 
				try 
				{
					Thread.sleep(300);
				} 
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}

class pares implements Runnable
{
	int n; 

	public pares(int n)
	{
		this.n = n; 
	}

	public void run()
	{
		System.out.print("Imprimiendo numeros pares");
		for(int i = 0; i < n; i++)
		{
			if(i%2 == 0)
			{
				System.out.println(i);
				System.out.println(""); 
				try 
				{
					Thread.sleep(300);
				} 
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}

public class ejercicio2
{	
	public static void main(String args[])
	{

		int vei = 30; // Valor estandar inicial

		Runnable i = new impares(vei);
		Runnable p = new pares(vei); 

		Thread t1 = new Thread(i);
		Thread t2 = new Thread(p); 

		t1.start();
		t2.start(); 
	}
	
}
