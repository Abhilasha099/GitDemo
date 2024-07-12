import java.util.ArrayList;

public class collectionDemo {

	public static void main(String[] args) {
		
		int a[]= {4,4,5,5,6,5,3,1,1,3,4};
		
		//print unique numbers from array and how many count of repeated nos if any
		// TODO Auto-generated method stub
		
		//empty arraylist
		//print unique number from list-Amazon
		ArrayList<Integer> ls= new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			if(!ls.contains(a[i]))
				
			{
				ls.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++)
					
				{
					if(a[i]==a[j])
					{
					
					k++;
					}
				}
				System.out.println(a[i]+":"+"Count:"+ k);
				
				if(k==1)
				{
					System.out.println(a[i]+" is unique number");
				}
			}
			
			//System.out.println(a[i]+":"+"Count:"+ k);
			//System.out.println(k);
			
		}
		
			

	}

}
