import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class arryListExample {

	public static void main(String[] args) {
		
		/*ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(5);
		ArrayList<String> b= new ArrayList<String>();
		b.add("Abhilasha");
		b.add("Fixed");
		b.add(0, "Natasha");
		//b.remove(2);
		System.out.println(b.get(1));
		//System.out.println(b);
		// TODO Auto-generated method stub
		System.out.println(b.contains("Fixed"));
		System.out.println(b.indexOf("Abhilasha"));
		System.out.println(b.isEmpty());
		System.out.println(b.size());*/
		
		//HashSet, TreeSet, LinkedHashset implements  Set interface
		//Set interface doesnt accept duplicate values
		//there is no guarantee if elements added in sequence like List. they r stored in random order
		HashSet<String> hs=new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("India");
		hs.add("India");
		hs.add("He");
		hs.add("She");
		Iterator<String> itr= hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			//itr.next();
		}
		//System.out.println(itr.next());
		//System.out.println(itr.next());
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		System.out.println(hs);

		//HashMap- takes values in key value pair Key and Value
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(0, "Neha");
		hm.put(1, "Mehak");
		hm.put(2, "Tree");
		hm.put(3, "Plant");
		System.out.println(hm.get(3));
		hm.remove(0);
		System.out.println(hm.get(0));
		//EntrySet- make key value pair as set
		Set sn= hm.entrySet();
		Iterator it = sn.iterator();
		while(it.hasNext())
		{
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
	}

}
