
public class SumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {4,3,2,5,7};
		//int sum=sumArray(a);
	//	System.out.println("The sum of elements of array is "+sum);
		int temp;
		//sorting of array
		
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
				
			{
				if(a[i]>a[j])//4>3
					
				{
					
					temp=a[i]; //temp=4
					a[i]=a[j]; //a[i]=3
					a[j]=temp; //a[j]=4
				}
			}
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		
		

	}
	
	
	/*private static int sumArray(int[] a)
	{
		
		int sum=0;
		
		for(int i=0;i<a.length;i++)
			
		{
			sum=sum+a[i];
		}
		
		return sum;
		
	}*/

}
