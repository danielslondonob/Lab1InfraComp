
class impares extends Thread
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

class pares extends Thread
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

public class ejercicio1
{	
	public static void main(String args[])
	{

		int vei = 30; // Valor estandar inicial

		impares i = new impares(vei);
		pares p = new pares(vei); 

		i.start();
		p.start();
	}
	
}
