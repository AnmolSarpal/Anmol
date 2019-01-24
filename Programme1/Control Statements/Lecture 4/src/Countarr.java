class Countarr
{
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	int arr [][]=new int[5][5];
	System.out.println("Enter elements of 2D array having 5 rows and 5 columns  each entered no. should be a 2 digit no. ");
		for (int count1=0;count1<5;count1++)
		{
		  for (int count2=0; count2<5;count2++)
		  {
		  arr[count1][count2] = scan.nextInt();
		    if(arr[count1][count2]>=10 && arr[count1][count2]<=99)
		    continue;                                              
		    else 
		    {
		    System.out.println(" Please enter a 2 digit number : ");
		    arr[count1][count2] = scan.nextInt();                    
		    }
		  }
		}
		System.out.print(" \n The final array is:  "  );
		for (int counter=0;counter<5;counter++)
		{
			for (int count=0;count<5;count++)
			{
			  if (arr[counter][count]%2==1)
			  {
			  arr[counter][count]*=2;                     
			  }
			System.out.print(arr[counter][count]+"\t");
			}
		System.out.println("");				                 
		}
	}
}