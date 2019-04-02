import java.util.Random;
import java.io.*;
class Puzzle
{
	public static void main(String [] args)
	{
		
		Random r=new Random();
		
		
		
		
		Repos e=new Repos();
		Console c=System.console();
		char cont;
		do
		{
		int count=0;
		System.out.println("\n\n----------------------------------------------------");
		System.out.println("         WELCOME TO THE JUMBLE WORDS !!! ");
		System.out.println("----------------------------------------------------");
		System.out.println(" PRESS 1.FOR EASY \n PRESS 2.FOR DIFFICULT \n PRESS 3.FOR PROLEVEL \n 4.EXIT\n\n");
		int choice=Integer.parseInt(c.readLine("CHOICE :"));
		switch(choice)
		{
	 		case 1:
				{
					do
					{
						int i=0;
						int []checky=new int [44];
					System.out.println("\n----------------------------------\n GAME MODE : EASY\n----------------------------------\n");
					do
					{
						int rnum=r.nextInt(43);
						
						for(int j=0;j<i;j++)
						{
							if(checky[j]==rnum)
							{
								rnum=r.nextInt(43);
								j=0;
							}
							
							else
							{
								checky[i]=rnum;
							}
						}
						System.out.println("\n GUESS THE WORD : "+e.wordEj[rnum]);
						String ans=c.readLine(" ANSWER :");
						if(e.wordE[rnum].equals(ans))
						{
							count++;
							System.out.println(" CORRECT :)");
						}
						else
						{
							System.out.println(" INCORRECT :(\n THE CORRECT ANSWER IS : "+e.wordE[rnum]);
						}
						i++;
					}
					while(i<10);
						System.out.println("\n----------------------------------\n YOUR SCORE\n\n TOTAL :10\n CORRECT :"+count+"\n SCORE :"+count*10);
						System.out.println("\n\n DO YOU WANT TO CONTINUE ?");
						cont=c.readLine("press y to continue....").charAt(0);
					}
					while(cont=='y'||cont=='Y');
				}break;

				case 2:
				{
					do
					{
						int i=0;
						int []checky=new int [44];
					System.out.println("\n------------------------------\n GAME MODE : DIFFICULT\n------------------------------\n");
					do
					{
						int rnum=r.nextInt(43);
						for(int j=0;j<i;j++)
						{
							if(checky[j]==rnum)
							{
								rnum=r.nextInt(43);
								j=0;
							}
							
							else
							{
								checky[i]=rnum;
							}
						}
						System.out.println("\n GUESS THE WORD : "+e.wordDj[rnum]);
						String ans=c.readLine(" ANSWER :");
						if(e.wordD[rnum].equals(ans))
						{
							count++;
							System.out.println(" CORRECT :)");
						}
						else
						{
							System.out.println(" INCORRECT :(\n THE CORRECT ANSWER IS :"+e.wordD[rnum]);
						}
						i++;
					}
					while(i<10);
						System.out.println("\n------------------------------\n YOUR SCORE\n\n TOTAL :10\n CORRECT :"+count+"\n SCORE :"+count*10);
						System.out.println("\n\n DO YOU WANT TO CONTINUE ?");
						cont=c.readLine("press y to continue....").charAt(0);
					}
					while(cont=='y'||cont=='Y');
				}
				break;
				case 3:
				{
					do
					{
						int i=0;
						int []checky=new int [44];
					System.out.println("\n------------------------------\n GAME MODE : PROLEVEL\n------------------------------\n");
					do
					{
						int rnum=r.nextInt(43);
						for(int j=0;j<i;j++)
						{
							if(checky[j]==rnum)
							{
								rnum=r.nextInt(43);
								j=0;
							}
							
							else
							{
								checky[i]=rnum;
							}
						}
						System.out.println("\n GUESS THE WORD : "+e.wordPj[rnum]);
						String ans=c.readLine(" ANSWER :");
						if(e.wordP[rnum].equals(ans))
						{
							count++;
							System.out.println(" CORRECT :)");
						}
						else
						{
							System.out.println(" INCORRECT :(\n the correct answer is : "+e.wordP[rnum]);
						}
						i++;
					}
					while(i<10);
						System.out.println("\n------------------------------\n YOUR SCORE\n\n TOTAL :10\n CORRECT :"+count+"\n SCORE :"+count*10);
						System.out.println("\n\n DO YOU WANT TO CONTINUE ?");
						cont=c.readLine("press y to continue....").charAt(0);
					}
					while(cont=='y'||cont=='Y');
					
				}
				break;
			case 4:
			{
				System.out.println("\n have a nice day,GOODBYE  :)\n");
				java.lang.System.exit(0);
			}
			break;
			default:
			System.out.println("\n you have entered a wrong choice :( \n");
		}
		
		}while(true);
		
	}
}
				
				
			
			
		
		