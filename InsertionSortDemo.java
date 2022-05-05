


public class InsertionSortDemo
{
	static void insertionSort(int a1[])
	{
		int temp,j;
		for(int i=a1.length-1;i>=0;i--)
		{
		    temp=a1[i];
			j=i;
			while(j>0&&a1[j-1]>temp)
			{
				a1[j]=a1[j-1];
				for(int a:a1)
				System.out.print(a+" ");
		    	System.out.println();
				j=j-1;
			}
			//for(int a:a1)
			//	System.out.print(a+" ");
		    	//System.out.println();
			a1[j]=temp;
			
		}
		//for(int i:a1)
			//System.out.print(i+" ");
		for(int i=0;i<a1.length;i++)
		{
			System.out.print(a1[i]+" ");
		}
	}
   public static void main(String args[])
   {
	   int a1[]={2,4,6,8,3};
	   insertionSort(a1);
   
   }
}