import java.util.ArrayList;
import java.util.LinkedList;

public class TrickyQues {

	public static void main(String[] args) {


		String str="Abhilasha Gupta";
		System.out.println(str.substring(6)+","+str.substring(0,5));
		System.out.println(str.substring(1,2)); 
		System.out.println("Hello summers");
		System.out.println("Hell is hello");
		System.out.println("Hello line 44");
		
		//Ternary operator
		int a=10;
		int b=4;
		int Max;
		int c=2;
		//Max=(a>b)? a : b;
		Max=(a>b)? (a>c ? a : c) : (b>c ? b : c);
		//c=(a>b) ? (a-b) : (a+b);
		
		
		
		System.out.println(Max);
		//System.out.println(c);
		
		int[] ab= {15,34,23,12,54};
		for(int ba : ab)
		{
			System.out.println(ba + " ");

		}
		
		/*ArrayList<String> Name=new ArrayList<String>();
			Name.add("Anjali");
			Name.add("Rahul");
			Name.add(1, "Eisha");
			
			System.out.println(Name);
			Name.set(0, "Abhilasha");
			System.out.println(Name);
			Name.clear();*/

			//System.out.println(Name);
			LinkedList<String> ln= new LinkedList<String>();
			
			ln.add("Anjali");
			ln.addLast("Isha");
			ln.add("Rahul");
			ln.addFirst("Tina");
			
			System.out.println(ln);
			ln.add(1, "Wioo");
			System.out.println(ln);
		
		
	}

}
