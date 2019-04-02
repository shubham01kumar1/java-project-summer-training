import java.util.Random;
class Test
{public static void main(String [] args)
{
	Random r=new Random();
	int []arr=new int[40];
	int rnum=0;
	
	for(int j=0;j<40;j++)
	{
		if(arr[j]==rnum)
		{
		rnum=r.nextInt(40);
		j=0;
		System.out.println("1");
		}
		
	}
	for(int i=0;i<40;i++)
	{
	System.out.println("hi"+i+arr[i]);
	
	}
	}
	}