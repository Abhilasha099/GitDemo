
public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {51,34,43,12,32};
		int size=a.length;
		int temp;
		for(int i=0 ;i< size; i++)
		{
			for(int j=i+1;j< size;j++)
				
			{
				
				if(a[i]>a[j])
				{
					temp=a[i];//temp=51, a[0]=51 a[2]=43, temp=51
					a[i]=a[j];//a[0]=34 , a[0]=43
					a[j]=temp; //a[1]=51 a[0]=51, a[1]=34 , a[2]=51
				}
			}
			
			//System.out.println(a[i]);
		}
		
		for(int i=0 ;i< size; i++)
		{
			System.out.println(a[i]);
		}
		
		
		// 0,1,2,3,5,8,13,21
		
		
		
	}

}
