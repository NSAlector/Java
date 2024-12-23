package practice_3;
import java.util.Scanner;

public class Main {
	
	//void
	public static int Sum(int a, int b)
	{
		return a + b;
	}
	
	public static int Sum(int a)
	{
		return a + 10;
	}
	
	public static int Sum(float a, float b)
	{
		return (int)(a*2.0 + b*2.0 );
	}
	
	public static int Fact(int n)
	{
		if (n <= 1) return 1;
		else return n*Fact(n-1);
	}
	
	public static int[] VecProcessing(int[] vec)
	{
		for(int i = 1; i < vec.length; ++i)
			vec[i] += vec[i-1];
		
		return vec;
	}
	
	public static void VecProcessing2(int[] vec)
	{
		for(int i = 1; i < vec.length; ++i)
			vec[i] += vec[i-1];
	}
	
	public static int[] CalcHist(int[] vec)
	{
		int []hist = new int[10];
		
		for(int i = 0; i < vec.length; ++i)
		{
			++hist[vec[i]];
		}
		
		return hist;
	}
	
	public static void Print(int[] vec, String name)
	{
		System.out.println( "Array : " + name );
		for(int i = 0; i < vec.length; ++i)
			System.out.println( vec[i] );
	}
	
	public static void main(String []args)
	{
		Scanner scn = new Scanner(System.in);
		
		//System.out.println("Input two numbers");
		
		//int a = scn.nextInt();
		//int b = scn.nextInt();
		
		//System.out.println( Sum(a,b) );	
		//System.out.println( Sum(a) );
		//System.out.println( Sum((float)a, (float)b) );
		//System.out.println( Fact(a) );
		
		int [] vec = new int[100];
		for(int i = 0; i < vec.length; ++i)
			vec[i] = (int)(Math.random()*10);
		
		System.out.println( "Input vector" );
		for(int i = 0; i < vec.length; ++i)
			System.out.println( vec[i] );
		
		//vec = VecProcessing(vec);
		//VecProcessing2(vec);
		
		
		//System.out.println( "Result vector" );
		//for(int i = 0; i < vec.length; ++i)
		//	System.out.println( vec[i] );
		
		int []hist = CalcHist(vec);
		Print(hist, "Histogram");
			
	}

}
