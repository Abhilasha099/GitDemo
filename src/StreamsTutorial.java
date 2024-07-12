import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamsTutorial {
	@Test
	public void streamFilter()
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("Cyrus");
		names.add("Trisha");
		names.add("Taru");
		names.add("Shivangi");
		names.add("Amy");
		
		Long c=names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
	long d=Stream.of("Abhijeet","vishal","Ankur","Abir").filter(s1->
	{
		s1.startsWith("A");
	return true;
	}).count();
	System.out.println(d);
	//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	//names.stream().filter(s->s.equalsIgnoreCase("Amy")).forEach(s->System.out.println(s+" is printed"));
	names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}

@Test
public void streamMap()
{
	
	
	
	ArrayList<String> names1=new ArrayList<String>();
	names1.add("Don");
	names1.add("Aaina");
	names1.add("Frooty");
	names1.add("Pari");
	names1.add("sahil");
	
	//print names which has last letter as a
	//convert array into list apply streams and use sorted
	//Stream.of("Abhijeet","vishal","Ankura","Abhilasha").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
   //print names which has first letter as a with upppercase and sorted
	List<String> names=Arrays.asList("Avhijeet","vishal","Ankura","Abhilasha");
   // names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
   // names.stream().filter(s->s.endsWith("a")).sorted().map(s->s.concat("tt")).forEach(s->System.out.println(s));
    
    //merging to different lists
    Stream<String> newStream=Stream.concat(names.stream(), names1.stream());
    //newStream.sorted().forEach(s->System.out.println(s));
  boolean flag=  newStream.anyMatch(s->s.equalsIgnoreCase("ankura"));
  System.out.println(flag);
  Assert.assertTrue(flag);
}

@Test
public void streamCollect()
{
	//list-do manipulation-convert it into list
	//new list
	List<String> ls=Stream.of("Neha","Vaishali","Brinda","Tanuj").filter(s->s.endsWith("i")).map(s->s.toUpperCase()).collect(Collectors.toList());
	System.out.println(ls.get(0));
	
	//print uniqu number from this array
	//sort the array
	List<Integer> values=Arrays.asList(3,4,3,4,5,6,5,7,3);
	
	//3,4,5,6,7
	values.stream().distinct().forEach(s->System.out.println("collection "+s));
	List<Integer> ls1=values.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println("The third index "+ls1.get(3));
}
}
