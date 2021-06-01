
public class Pattern2 {
	
	public static void RecursivePrint(int x)
	{

		for(int i=0;i<x;i++)
		{
			if(i==0||i%2==0)
				System.out.print(1 +" ");
			else
				System.out.print(2 +" ");
		}
		System.out.print("\n");
		if(x<5)
		{
			RecursivePrint(x+1);

			for(int j=0;j<x;j++)
			{
				if(j==0||j%2==0)
					System.out.print(1 +" ");
				else
					System.out.print(2 +" ");
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		
		RecursivePrint(1);

	}

}
